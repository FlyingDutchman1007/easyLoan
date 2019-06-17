package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.LenderFundVO;
import loan.easyLoan.entity.LenderAccount;
import loan.easyLoan.entity.RechargeRecord;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.entity.WithdrawRecord;
import loan.easyLoan.service.LenderAccountService;
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

/**
 * @author Ywr
 * @date 2019/6/13 13:21
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class LenderFundController {
    @Autowired
    LenderAccountService lenderAccountService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private RechargeRecordService rechargeRecordService;

    @Autowired
    private UserRequiredInfoService userRequiredInfoService;

    @Autowired
    private WithdrawRecordService withdrawRecordService;

    @ApiOperation(value = "展示借出方资金账户")
    @GetMapping(value = "/lenderFund", produces = "application/json;charset=UTF-8")
    public LenderFundVO lenderFund(){
        //获取session并将userName存入session对象
        HttpSession session = httpServletRequest.getSession();
        System.out.println(session.getId());
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        //获取id号
        String id = userRequiredInfo.getIdCard();

        // 生成VO
        LenderFundVO lenderFundVO = new LenderFundVO();
        // 利用service找到borrowAccount
        LenderAccount lenderAccount =lenderAccountService.viewLenderAccount(id);
        System.out.println(lenderAccount.toString());

        // 复制属性
        BeanUtils.copyProperties(lenderAccount, lenderFundVO);
        BeanUtils.copyProperties(userRequiredInfo,lenderFundVO);
        System.out.println(lenderFundVO.toString());

        return lenderFundVO;
    }


    @ApiOperation(value = "借出方账户充值")
    @PostMapping(value = "/lenderRecharge", produces = "application/json;charset=UTF-8")
    public String lenderRecharge(@RequestBody Map obj){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        String fundsAccount =lenderAccountService.findFundsAccount(id);

        boolean ifRechargeSuccessful = lenderAccountService.updateRechargeAccount(Double.parseDouble((String)obj.get("money")),fundsAccount);
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



    @ApiOperation(value = "借出方账户提现")
    @PostMapping(value = "/lenderWithdraw", produces = "application/json;charset=UTF-8")
    public String lenderWithdraw(@RequestBody Map obj){
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        System.out.println(Double.parseDouble((String)obj.get("money")));

        LenderAccount lenderAccount = lenderAccountService.viewLenderAccount(id);
        String  fundsAccount= lenderAccountService.findFundsAccount(id);
        double money = Double.parseDouble((String)obj.get("money"));

        if(lenderAccount.getAccountBalance()>=money){
            boolean ifWithdrawSuccessful= lenderAccountService.updateWithdrawAccount(Double.parseDouble((String)obj.get("money")),fundsAccount);
            WithdrawRecord withdrawRecord = new WithdrawRecord();
            withdrawRecord.setSerialNumber(rechargeRecordService.getSerialNumber("withdraw"));
            withdrawRecord.setBankAccount(userRequiredInfoService.findUserByIdCard(id).getBankAccount());
            withdrawRecord.setWithdrawDate(new Date());
            withdrawRecord.setWithdrawMoney(Double.parseDouble((String)obj.get("money")));
            System.out.println(withdrawRecord.toString());
            withdrawRecordService.insertWithdrawRecord(withdrawRecord);
            if(ifWithdrawSuccessful){
                return "{\"state\": \"successful\" }";
            }else {
                return "{\"state\": \"fail\" }";
            }
        }else {
            return "{\"state\": \"fail\" }";
        }

    }
}
