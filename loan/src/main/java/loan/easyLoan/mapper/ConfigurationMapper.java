package loan.easyLoan.mapper;

import loan.easyLoan.entity.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface ConfigurationMapper {
    int insertParameter(Configuration configuration);//插入参数

    int updateParameter(Configuration configuration);//修改参数

    String selectParameter(String parameterName);//查找参数
}