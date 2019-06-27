package loan.easyLoan.util;

import loan.easyLoan.entity.Configuration;
import loan.easyLoan.entity.IntendBorrow;
import loan.easyLoan.service.ConfigurationService;
import loan.easyLoan.service.IntendBorrowService;
import loan.easyLoan.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final Logger logger = LoggerFactory.getLogger("ScheduledTasks.class");

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private TradeService tradeService;

    @Autowired
    private ConfigurationService configurationService;

    @Autowired
    private IntendBorrowService intendBorrowService;

//    @Scheduled(fixedRate = 5000) // 每隔多少毫秒数进行一次事务
//    public void reportCurrentTime() {
//        logger.info("The time is now {}", dateFormat.format(new Date()));
//    }

    @Scheduled(fixedRate = 60000) // 每隔多少毫秒数进行一次事务
    public void updateTrade() throws ParseException {
        tradeService.updateTradeEveryMonth();
        logger.info("完成对Trade列表的更新...");
    }

    @Scheduled(fixedRate = 10000)
    public void updateCurrentDate(){
        if(configurationService.selectParameter("date")==null){
            Configuration currentDate = new Configuration();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            currentDate.setParameterName("date");
            currentDate.setParameterValue(sdf.format(date));
            configurationService.insertParameter(currentDate);
        }
    }

    @Scheduled(fixedRate = 60000)
    public void updateInvalidIntendBorrow(){

        List<Integer> updateList = intendBorrowService.selectLoseEfficacy();

        if(!updateList.isEmpty()){
            intendBorrowService.updateInvalidState(updateList);
        }

    }


}
