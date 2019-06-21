package loan.easyLoan.controller;

import loan.easyLoan.VO.LenderToReceiveVO;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.LenderAccountService;
import loan.easyLoan.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ReceivalRecordController {

    @Autowired
    private LenderAccountService lenderAccountService;
    @Autowired
    private TradeService tradeService;
    @Autowired
    private HttpServletRequest httpServletRequest;


    @ResponseBody
    @GetMapping(value = "/lenderToReceive", produces = "application/json;charset=UTF-8")
    public List<LenderToReceiveVO> borrowerFinishedRecord() {

        List<LenderToReceiveVO> lenderToReceiveVOList = new ArrayList<>();
        HttpSession session = httpServletRequest.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        String fundsAccount = lenderAccountService.findFundsAccount(id);
        List<Trade> list = tradeService.selectPendingReceivable(fundsAccount);
        for (Trade trade : list) {

            LenderToReceiveVO lenderToReceiveVO = new LenderToReceiveVO();
            System.out.println(trade.getBillId());
            lenderToReceiveVO.setBillId(trade.getBillId());
            lenderToReceiveVO.setStartDate(trade.getExactDate());
            lenderToReceiveVO.setMoney(trade.getMoney());
            lenderToReceiveVO.setCollectedMoney(trade.getRepaidPrincipal());
            lenderToReceiveVO.setInterest(trade.getShouldRepayInterest());
            lenderToReceiveVO.setCollectedInterest(trade.getRepaidInterest());
            lenderToReceiveVO.setLiquidatedMoney(trade.getShouldRepayLiquidatedMoney());
            lenderToReceiveVO.setCollectedLiquidatedMoney(trade.getLiquidatedMoney());
            lenderToReceiveVO.setTotalMoney(trade.getMoney()+trade.getShouldRepayInterest()+trade.getShouldRepayLiquidatedMoney());
            lenderToReceiveVO.setCollectedTotalMoney(trade.getRepaidPrincipal()+trade.getRepaidInterest()+trade.getLiquidatedMoney());
            lenderToReceiveVO.setRate(trade.getPayRate());
            lenderToReceiveVO.setPayType(trade.getPayType());
            lenderToReceiveVO.setDeadline(trade.getFinishedDate());

            lenderToReceiveVOList.add(lenderToReceiveVO);
        }

        if (lenderToReceiveVOList.isEmpty()) {
            return null;
        } else {
            return lenderToReceiveVOList;
        }
    }
}
