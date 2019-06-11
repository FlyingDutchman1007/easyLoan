package loan.easyLoan.mapper;

import loan.easyLoan.entity.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface ConfigurationMapper {
    int insert(Configuration record);

    int insertSelective(Configuration record);
}