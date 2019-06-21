package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.VO.LenderFinishedRecordVO;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.LenderAccountService;
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
public class LenderFinishedRecordController {

    @Autowired
    private LenderAccountService lenderAccountService;
    @Autowired
    private TradeService tradeService;

    @ApiOperation(value = "借出方已完成记录")
    @GetMapping(value = "/lenderFinishedRecord", produces = "application/json;charset=UTF-8")
    public List<LenderFinishedRecordVO> lenderFinishedRecord(HttpServletRequest request){

        List<LenderFinishedRecordVO> lenderFinishedRecordVOList = new ArrayList<>();
        HttpSession session = request.getSession();
        UserRequiredInfo userRequiredInfo = (UserRequiredInfo) session.getAttribute(session.getId());
        String id = userRequiredInfo.getIdCard();

        String fundsAccount = lenderAccountService.findFundsAccount(id);
        List<Trade> list = tradeService.lendViewFinishedRecord(fundsAccount);

        for (Trade trade : list) {

            LenderFinishedRecordVO lenderFinishedRecordVO = new LenderFinishedRecordVO();

            lenderFinishedRecordVO.setBillId(trade.getBillId());
            lenderFinishedRecordVO.setStartDate(trade.getExactDate());
            lenderFinishedRecordVO.setMoney(trade.getMoney());
            lenderFinishedRecordVO.setInterest(trade.getRepaidInterest());
            lenderFinishedRecordVO.setLiquidatedMoney(trade.getLiquidatedMoney());
            lenderFinishedRecordVO.setTotalMoney(trade.getMoney()+trade.getRepaidInterest()+trade.getLiquidatedMoney());
            lenderFinishedRecordVO.setRate(trade.getPayRate());
            lenderFinishedRecordVO.setLimitMonths(trade.getLimitMonths());
            lenderFinishedRecordVO.setPayUpDate(trade.getFinishedDate());

            lenderFinishedRecordVOList.add(lenderFinishedRecordVO);
        }

        if(lenderFinishedRecordVOList.isEmpty()){
            return null;
        }else{
            return lenderFinishedRecordVOList;
        }
    }
}