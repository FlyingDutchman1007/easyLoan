package loan.easyLoan.controller;


import loan.easyLoan.entity.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerToTradeVO;
import loan.easyLoan.service.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/13 13:21
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class LenderController {


    @Autowired
    private IntendLendService intendLendService;

    @Autowired
    private LenderAccountService lenderAccountService;

    @Autowired
    private IntendBorrowService intendBorrowService;

    @Autowired
    private TradeService tradeService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @GetMapping(value = "/index")
    public String aaa(){
        return "helloWorld";
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="intendMoney",value="金额",paramType="json"),
            @ApiImplicitParam(name="limitMonths",value="借款期限",paramType="json"),
            @ApiImplicitParam(name="expectRate",value="预期利率",paramType="json"),
            @ApiImplicitParam(name="payType",value="还款方式",paramType="json")
    })
    @ApiOperation(value = "意向借出")
    @PostMapping(value = "/subLendQuery", produces = "application/json;charset=UTF-8")
    public String subLendQuery(@RequestBody Map obj){
        double intendMoney = Double.parseDouble((String)obj.get("intendMoney"));
        int limitMonths = (Integer) obj.get("limitMonths");
        float rate = Float.parseFloat((String)obj.get("expectRate"));
        float expectRate = rate/100;
        int payType = Integer.parseInt((String) obj.get("payType"));

        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();

        double balance =  lenderAccountService.selectAccountBalance(idCard);

        if (balance > intendMoney){
            return "{\"state\":\"successful\"}";
        }else {
            return "{\"state\":\"fail\"}";
        }
    }


    @ApiOperation(value = "意向借出")
    @PostMapping(value = "/lendMatch", produces = "application/json;charset=UTF-8")
    public List<BorrowerToTradeVO> lendMatch(@RequestBody Map obj){
        double intendMoney = Double.parseDouble((String)obj.get("intendMoney"));
        int limitMonths = Integer.parseInt((String) obj.get("limitMonths"));
        float expectRate = Float.parseFloat((String)obj.get("expectRate"));
        float rate = expectRate/100;
        int payType = Integer.parseInt((String)obj.get("payType"));

        List<Match> list =  intendBorrowService.selectCounterParty(rate,limitMonths,payType);
        List<BorrowerToTradeVO> list1 = new ArrayList<>();

        for (int i = 0;i<list.size();i++){
            Match match = list.get(i);
            BorrowerToTradeVO borrowerToTradeVO = new BorrowerToTradeVO();
            BeanUtils.copyProperties(match, borrowerToTradeVO);
            list1.add(borrowerToTradeVO);

            System.out.println(borrowerToTradeVO.toString());
        }
        return list1;
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name="billId",value="账目ID",paramType="json"),
            @ApiImplicitParam(name="lendMoney",value="金额",paramType="json"),
            @ApiImplicitParam(name="intendLendDate",value="意向借出日期",paramType="json")
    })
    @ApiOperation(value = "意向借出")
    @PostMapping(value = "/subLend", produces = "application/json;charset=UTF-8")
    public String subLend(@RequestBody Map obj){
        int billId = Integer.parseInt((String)obj.get("billId"));
        double lendMoney = Double.parseDouble((String)obj.get("lendMoney"));
        Timestamp intendLendDate = Timestamp.valueOf((String)obj.get("intendLendDate"));

        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();

        IntendBorrow intendBorrow = intendBorrowService.selectIntendAndRaisedMoney(billId);
        double intendMoney = intendBorrow.getIntendMoney();
        double raisedMoney = intendBorrow.getRaisedMoney();
        double balance = intendMoney - raisedMoney;

        if (balance >= lendMoney){
            intendLendService.insertIntendLend(billId,idCard,lendMoney,intendLendDate);
            intendBorrowService.updateRaisedMoney(lendMoney);
            lenderAccountService.updateLentMoney(lendMoney,lenderAccountService.findFundsAccount(idCard));
            if(intendBorrowService.selectIntendAndRaisedMoney(billId).getIntendMoney() == intendBorrowService.selectIntendAndRaisedMoney(billId).getRaisedMoney()){
                intendLendService.updateState(billId);
                intendBorrowService.updateState(billId);
                //借出者
                List<IntendLend> intendLends=  intendLendService.selectLender(billId);
                //借入者
                IntendBorrow intendBorrow1 = intendBorrowService.selectIntendAndRaisedMoney(billId);
                tradeService.trade(intendBorrow1,intendLends);
            }
            return "{\"state\":\"successful\"}";
        }else {
            return "{\"state\":\"fail\"}";
        }
    }

}
