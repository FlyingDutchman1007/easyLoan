package loan.easyLoan.controller;

import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.UserOptionalInfo;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping
public class BorrowerController {
    @Autowired
    private IntendBorrowService intendBorrowService;

    @PostMapping(value = "/subBorrow", produces = "application/json;charset=UTF-8")
    public String subBorrow(HttpServletRequest request, @RequestBody Map obj){

        HttpSession session = request.getSession();// 获取session并将userName存入session对象
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();//获取id号


        if(intendBorrowService.selectPendingTransaction(id)== null){ //如果没有已有的交易记录，说明可以提交借款申请

            // 获取一个新账单的所有数据
            double intendMoney = (double)obj.get("intendMoney");
            java.sql.Timestamp startDate = (java.sql.Timestamp)obj.get("startDate");
            float payRate = (float) obj.get("rate");
            int payType = (int) obj.get("payType");
            int limitMonths = (int) obj.get("limitMonths");

            // 调用Service提供的方法
            intendBorrowService.insertApplicateForBorrower(id, intendMoney, startDate, payRate, payType, limitMonths);
            return "{\"state\":\"success\"}";
        }else{
            return "{\"state\":\"failure\"}";
        }
    }
}
