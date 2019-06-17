package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerFundVO;
import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.entity.RechargeRecord;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.entity.WithdrawRecord;
import loan.easyLoan.service.BorrowerAccountService;
import loan.easyLoan.service.RechargeRecordService;
import loan.easyLoan.service.UserRequiredInfoService;
import loan.easyLoan.service.WithdrawRecordService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerFundController {

    @Autowired
    private BorrowerAccountService borrowerAccountService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private RechargeRecordService rechargeRecordService;

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @Autowired
    private WithdrawRecordService withdrawRecordService;

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

        if(ifRechargeSuccessful){
            RechargeRecord rechargeRecord = new RechargeRecord();
            rechargeRecord.setSerialNumber(rechargeRecordService.getSerialNumber("recharge"));
            rechargeRecord.setBankAccount(userRequiredInfoService.findUserByIdCard(id).getBankAccount());
            rechargeRecord.setRechargeDate(new Date());
            rechargeRecord.setRechargeMoney(Double.parseDouble((String)obj.get("money")));
            rechargeRecordService.insertRechargeRecord(rechargeRecord);
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

        BorrowerAccount borrowerAccount = borrowerAccountService.viewBorrowerAccount(id);
        String  fundsAccount= borrowerAccountService.findFundsAccount(id);
        double money = Double.parseDouble((String)obj.get("money"));

        if(borrowerAccount.getAccountBalance()>=money){
            boolean ifWithdrawSuccessful= borrowerAccountService.updateWithdrawAccount(Double.parseDouble((String)obj.get("money")),fundsAccount);

            if(ifWithdrawSuccessful){
                WithdrawRecord withdrawRecord = new WithdrawRecord();
                withdrawRecord.setSerialNumber(rechargeRecordService.getSerialNumber("withdraw"));
                withdrawRecord.setBankAccount(userRequiredInfoService.findUserByIdCard(id).getBankAccount());
                withdrawRecord.setWithdrawDate(new Date());
                withdrawRecord.setWithdrawMoney(Double.parseDouble((String)obj.get("money")));
                System.out.println(withdrawRecord.toString());
                withdrawRecordService.insertWithdrawRecord(withdrawRecord);
                return "{\"state\": \"successful\" }";
            }else {
                return "{\"state\": \"fail\" }";
            }
        }else {
            return "{\"state\": \"fail\" }";
        }

    }


}
