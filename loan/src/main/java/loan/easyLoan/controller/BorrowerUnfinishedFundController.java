package loan.easyLoan.controller;


import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.PendingTransaction;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerUnfinishedFundController {

    @Autowired
    private IntendBorrowService intendBorrowService;

    @GetMapping(value = "/borrowerToTrade", produces = "application/json;charset=UTF-8")
    public List<PendingTransaction> borrowerToTrade(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();// 获取session并将userName存入session对象
        // 根据sessionId获取存放在session中的userRequiredInfo

        System.out.println("借入的session: "+session.getId());
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();//获取id号

        System.out.println("目前取得的"+idCard);
        System.out.println(intendBorrowService.selectPendingTransaction(idCard).isEmpty());

        if(intendBorrowService.selectPendingTransaction(idCard).isEmpty()==false){// 判断列表是否为空
            System.out.println(intendBorrowService.selectPendingTransaction(idCard).get(0));
            return intendBorrowService.selectPendingTransaction(idCard); // 取出第一个
        }
        return null; //返回取到的结果
    }
}
