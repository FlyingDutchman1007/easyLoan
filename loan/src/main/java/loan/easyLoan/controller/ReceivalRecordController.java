package loan.easyLoan.controller;

import loan.easyLoan.VO.LenderToReceiveVO;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.LenderAccountService;
import loan.easyLoan.service.TradeService;
import loan.easyLoan.util.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@Controller
public class ReceivalRecordController {

    @Autowired
    private LenderAccountService lenderAccountService;
    @Autowired
    private TradeService tradeService;
    @Autowired
    private TimeUtils timeUtils;

    @ResponseBody
    @GetMapping(value = "/lenderToReceive", produces = "application/json;charset=UTF-8")
    public List<LenderToReceiveVO> borrowerFinishedRecord(HttpServletRequest request) {

        List<LenderToReceiveVO> lenderToReceiveVOList = new ArrayList<>();
        HttpSession session = request.getSession();
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
            lenderToReceiveVO.setInterest(trade.getShouldRepayInterest()*trade.getLimitMonths());
            lenderToReceiveVO.setCollectedInterest(trade.getRepaidInterest());
            lenderToReceiveVO.setLiquidatedMoney(trade.getShouldRepayLiquidatedMoney());
            lenderToReceiveVO.setCollectedLiquidatedMoney(trade.getLiquidatedMoney());
            try {
                double rest_month = (Math.floor((trade.getLimitMonths() - timeUtils.getMonthDiff(timeUtils.getCurrentTime(),trade.getExactDate())-1)/trade.getPayType()));
                lenderToReceiveVO.setTotalMoney(trade.getNextTimePay()
                        + trade.getRepaidPrincipal()+trade.getRepaidInterest()
                        + trade.getLiquidatedMoney()+rest_month*(trade.getShouldRepayInterest()+trade.getShouldRepayPrincipal())/trade.getPayType());
            } catch (ParseException e) {
                e.printStackTrace();
            }
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
