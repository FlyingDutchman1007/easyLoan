package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.BorrowerFinishedRecordVO;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.BorrowerAccountService;
import loan.easyLoan.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class BorrowerFinishedRecordController {

    @Autowired
    private BorrowerAccountService borrowerAccountService;
    @Autowired
    private TradeService tradeService;

    @ApiOperation(value = "借入方已完成记录")
    @GetMapping(value = "/borrowerFinishedRecord", produces = "application/json;charset=UTF-8")
    public List<BorrowerFinishedRecordVO> borrowerFinishedRecord(HttpServletRequest request) {

        List<BorrowerFinishedRecordVO> borrowerFinishedRecordVOList = new ArrayList<>();
        HttpSession session = request.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        String fundsAccount = borrowerAccountService.findFundsAccount(id);
        List<Trade> list = tradeService.borrowViewFinishedRecord(fundsAccount);
        for (Trade trade : list) {

            BorrowerFinishedRecordVO borrowerFinishedRecordVO = new BorrowerFinishedRecordVO();

            borrowerFinishedRecordVO.setBillId(trade.getBillId());
            borrowerFinishedRecordVO.setStartDate(trade.getExactDate());
            borrowerFinishedRecordVO.setMoney(trade.getMoney());
            borrowerFinishedRecordVO.setInterest(trade.getShouldRepayInterest() * trade.getLimitMonths());
            borrowerFinishedRecordVO.setLiquidatedMoney(trade.getLiquidatedMoney());
            borrowerFinishedRecordVO.setTotalMoney(trade.getRepaidPrincipal()+trade.getRepaidInterest()+trade.getLiquidatedMoney());
            borrowerFinishedRecordVO.setRate(trade.getPayRate());
            borrowerFinishedRecordVO.setPayType(trade.getPayType());
            borrowerFinishedRecordVO.setLimitMonths(trade.getLimitMonths());
            borrowerFinishedRecordVO.setSettleDate(trade.getFinishedDate());

            borrowerFinishedRecordVOList.add(borrowerFinishedRecordVO);
        }

        if (borrowerFinishedRecordVOList.isEmpty()) {
            return null;
        } else {
            return borrowerFinishedRecordVOList;
        }
    }
}
