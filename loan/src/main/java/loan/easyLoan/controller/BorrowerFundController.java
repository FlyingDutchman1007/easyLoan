package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerFundVO;
import loan.easyLoan.entity.BorrowerAccount;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.BorrowerAccountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
        System.out.println(id);

        // 生成VO
        BorrowerFundVO borrowerFundVO = new BorrowerFundVO();
        // 利用service找到borrowAccount
        BorrowerAccount borrowerAccount =borrowerAccountService.viewBorrowerAccount(id);

        //为VO设置主键
        borrowerFundVO.setIdCard(id);
        // 复制属性
        BeanUtils.copyProperties(borrowerAccount, borrowerFundVO);
        BeanUtils.copyProperties(userRequiredInfo,borrowerFundVO);

        return borrowerFundVO;
    }

}
