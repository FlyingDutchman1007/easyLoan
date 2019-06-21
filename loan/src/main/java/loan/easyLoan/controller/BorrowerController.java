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
        // 获取session并将userName存入session对象
        HttpSession session = httpServletRequest.getSession();
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        //获取id号

        String idCard = userRequiredInfo.getIdCard();

        //如果没有已有的交易记录，说明可以提交借款申请
        if(intendBorrowService.selectPendingTransaction(idCard).isEmpty()){

            // 获取一个新账单的所有数据
            double intendMoney = Double.parseDouble((String) obj.get("intendMoney"));
            Timestamp startDate = Timestamp.valueOf((String)obj.get("startDate"));
            float rate = Float.parseFloat((String)obj.get("rate"));
            float payRate = rate/100;
            int payType = Integer.parseInt((String) obj.get("payType"));
            String limitMonth = (String) obj.get("limitMonths");
            int limitMonths = Integer.parseInt(limitMonth.substring(0,1));

            if(intendMoney <= borrowerAccountService.selectAvailableLimit(idCard)){
                // 调用Service提供的方法
                intendBorrowService.insertApplicateForBorrower(idCard, intendMoney, startDate, payRate, payType, limitMonths);
                borrowerAccountService.updateAvailableLimit(idCard,intendMoney);
            }else{
                return "{\"state\":\"fail\"}"; // 报错 剩余金额不足
            }

            return "{\"state\":\"successful\"}";
        }else{
            return "{\"state\":\"fail\"}";
        }
    }
}
