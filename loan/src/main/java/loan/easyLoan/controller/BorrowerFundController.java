package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerFundVO;
import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.BorrowerAccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerFundController {
    @Autowired
    BorrowerAccountService borrowerAccountService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @ApiOperation(value = "展示借入方资金账户")
    @GetMapping(value = "/borrowerFund", produces = "application/json;charset=UTF-8")
    public BorrowerFundVO borrowerFund(){
        //获取session并将userName存入session对象
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getId());
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        //获取id号
        String id = userRequiredInfo.getIdCard();

        // 生成VO
        BorrowerFundVO borrowerFundVO = new BorrowerFundVO();
        // 利用service找到borrowAccount
        BorrowerAccount borrowerAccount =borrowerAccountService.viewBorrowerAccount(id);

        // 复制属性
        BeanUtils.copyProperties(borrowerAccount, borrowerFundVO);
        BeanUtils.copyProperties(userRequiredInfo,borrowerFundVO);

        return borrowerFundVO;
    }


    @ApiOperation(value = "借入方账户充值")
    @PostMapping(value = "/borrowerRecharge", produces = "application/json;charset=UTF-8")
    public String borrowerRecharge(@RequestBody Map obj){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        String fundsAccount =borrowerAccountService.findFundsAccount(id);

        boolean ifRechargeSuccessful = borrowerAccountService.updateRechargeAccount(Double.parseDouble((String)obj.get("money")),fundsAccount);
        System.out.println(ifRechargeSuccessful);
        if(ifRechargeSuccessful){
            return "{\"state\": \"successful\" }";
        }else {
            return "{\"state\": \"fail\" }";
        }
    }



    @ApiOperation(value = "借入方账户提现")
    @PostMapping(value = "/borrowerWithdraw", produces = "application/json;charset=UTF-8")
    public String borrowerWithdraw(@RequestBody Map obj){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        System.out.println(Double.parseDouble((String)obj.get("money")));

        String  fundsAccount= borrowerAccountService.findFundsAccount(id);
        boolean ifWithdrawSuccessful= borrowerAccountService.updateWithdrawAccount(Double.parseDouble((String)obj.get("money")),fundsAccount);

        if(ifWithdrawSuccessful){
            return "{\"state\": \"successful\" }";
        }else {
            return "{\"state\": \"fail\" }";
        }
    }


}
