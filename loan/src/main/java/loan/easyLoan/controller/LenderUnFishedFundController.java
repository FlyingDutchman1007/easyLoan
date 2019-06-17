package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.PendingTransaction;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.IntendLendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/14 14:15
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class LenderUnFishedFundController {

    @Autowired
    private IntendLendService intendLendService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @ApiOperation(value = "展示借出方待交易界面")
    @GetMapping(value = "/lenderToTrade", produces = "application/json;charset=UTF-8")
    public List<PendingTransaction> lenderToReceive(){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String idCard = userRequiredInfo.getIdCard();

        if(!intendLendService.viewPendingTransaction(idCard).isEmpty()){
            return intendLendService.viewPendingTransaction(idCard);
        }
        return null;
    }
}
