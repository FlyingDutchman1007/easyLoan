package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.BorrowerAccountService;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerController {
    @Autowired
    private IntendBorrowService intendBorrowService;

    @Autowired
    private BorrowerAccountService borrowerAccountService;

    @Autowired
    private HttpServletRequest httpServletRequest;


    @ApiImplicitParams({
            @ApiImplicitParam(name="intendMoney",value="意向金额",paramType="json"),
            @ApiImplicitParam(name="startDate",value="借款日期",paramType="json"),
            @ApiImplicitParam(name="payRate",value="借款利率",paramType="json"),
            @ApiImplicitParam(name="payType",value="借款类型",paramType="json"),
            @ApiImplicitParam(name="limitMonths",value="借款时长",paramType="json")
    })
    @ApiOperation(value = "意向借入",notes = "意向借入接口")
    @PostMapping(value = "/subBorrow", produces = "application/json;charset=UTF-8")
    public String subBorrow(@RequestBody Map obj){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();

        //如果没有已有的交易记录，说明可以提交借款申请
        if(intendBorrowService.selectPendingTransaction(idCard).isEmpty()){

            // 获取一个新账单的所有数据
            try{
                double intendMoney = Double.parseDouble((String) obj.get("intendMoney"));
                Timestamp startDate = Timestamp.valueOf((String)obj.get("startDate"));
                float rate = Float.parseFloat((String)obj.get("rate"));
                float payRate = rate/100;
                int payType = Integer.parseInt((String) obj.get("payType"));
                int limitMonths = Integer.parseInt((String) obj.get("limitMonths"));

                if(intendMoney <= borrowerAccountService.selectAvailableLimit(idCard)){
                    intendBorrowService.insertApplicateForBorrower(idCard, intendMoney, startDate, payRate, payType, limitMonths);
                    borrowerAccountService.updateAvailableLimit(idCard,intendMoney);
                }else{
                    return "{\"state\":\"fail\"}";
                }
            }catch (Exception e){
                return "{\"state\":\"fail\"}";
            }

            return "{\"state\":\"successful\"}";
        }else{
            return "{\"state\":\"fail\"}";
        }
    }
}
