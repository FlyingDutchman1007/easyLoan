package loan.easyLoan;

import loan.easyLoan.entity.UserRequiredInfo;
import loan.easyLoan.service.UserRequiredInfoService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author Ywr
 * @date 2019/6/8 17:52
 */
public class MybatisTest {

    @Test
    public static void main(String[] arg) throws Exception{
        /*//1.读取配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        //3.使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserRequiredInfoService userRequiredInfoService = session.getMapper(UserRequiredInfoService.class);
        //5.使用代理对象执行方法
        List<UserRequiredInfo> userRequiredInfos = userRequiredInfoService.findAll();
        for (UserRequiredInfo userRequiredInfo : userRequiredInfos){
            System.out.println(userRequiredInfo);
        }
        //6.释放资源
        session.close();
        inputStream.close();*/

    }
}
