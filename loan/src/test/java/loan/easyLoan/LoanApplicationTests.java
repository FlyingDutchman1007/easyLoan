package loan.easyLoan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoanApplicationTests {

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {

        // 日志级别（由低到高）：trace < debug < info < warn < error
        // 同样可以调整日志输出级别；日志只会在这个级别以后的高级别生效
        logger.trace("trace logger...");
        logger.debug("debug logger...");
        // SpringBoot 默认给我们使用info级别
        logger.info("info logger...");
        logger.warn("warn logger...");
        logger.error("error logger...");



    }


}
