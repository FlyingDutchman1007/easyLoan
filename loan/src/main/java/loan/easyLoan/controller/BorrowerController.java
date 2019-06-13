package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerController {
    @Autowired
    private IntendBorrowService intendBorrowService;

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
        String id = userRequiredInfo.getIdCard();

        //如果没有已有的交易记录，说明可以提交借款申请
        if(intendBorrowService.selectPendingTransaction(id)== null){

            // 获取一个新账单的所有数据
            double intendMoney = (double)obj.get("intendMoney");
            java.sql.Timestamp startDate = (java.sql.Timestamp)obj.get("startDate");
            float payRate = (float) obj.get("rate");
            int payType = (int) obj.get("payType");
            int limitMonths = (int) obj.get("limitMonths");

            // 调用Service提供的方法
            intendBorrowService.insertApplicateForBorrower(id, intendMoney, startDate, payRate, payType, limitMonths);
            return "{\"state\":\"successful\"}";
        }else{
            return "{\"state\":\"fail\"}";
        }
    }
}
