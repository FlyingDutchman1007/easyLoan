package loan.easyLoan.controller;


import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "展示借入方待交易界面")
    @GetMapping(value = "/borrowerToTrade", produces = "application/json;charset=UTF-8")
    public List<PendingTransaction> borrowerToTrade(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();

        if(!intendBorrowService.selectPendingTransaction(idCard).isEmpty()){
            return intendBorrowService.selectPendingTransaction(idCard);
        }
        return null;
    }
}
