package loan.easyLoan.controller;


import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IntendBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping
public class BorrowerUnfinishedFundController {

    @Autowired
    private IntendBorrowService intendBorrowService;

    @GetMapping(value = "/borrowerToTrade", produces = "application/json;charset=UTF-8")
    public IntendBorrow borrowerToTrade(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();// 获取session并将userName存入session对象
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();//获取id号

        int billId = intendBorrowService.selectBillId(id);//取得billID
        for(IntendBorrow intendBorrow : intendBorrowService.selectPendingTransaction(id)){ //遍历pending队列
            if(intendBorrow.getBillId() == billId){ //若有匹配的则返回
                return intendBorrow;
            }
        }
        return new IntendBorrow(); //若无则返回一个空对象
    }
}
