package loan.easyLoan.controller;

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

@CrossOrigin
@RestController
@RequestMapping
public class BorrowerFundController {
    @Autowired
    BorrowerAccountService borrowerAccountService;

    @GetMapping(value = "/borrowerFund", produces = "application/json;charset=UTF-8")
    public BorrowerFundVO borrowerFund(HttpServletRequest request){
        HttpSession session = request.getSession();// 获取session并将userName存入session对象
        // 根据sessionId获取存放在session中的userRequiredInfo
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();//获取id号

        // 生成VO
        BorrowerFundVO borrowerFundVO = new BorrowerFundVO();
        // 利用service找到borrowAccount
        BorrowerAccount borrowerAccount =borrowerAccountService.viewBorrowerAccount(id);

        borrowerFundVO.setIdCard(id);
        BeanUtils.copyProperties(borrowerAccount, borrowerFundVO); // 复制属性

        return borrowerFundVO;

    }

}
