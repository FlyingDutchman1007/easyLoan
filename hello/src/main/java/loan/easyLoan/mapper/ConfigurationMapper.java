package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.Configuration;
import loan.easyLoan.entity.ConfigurationExample;
import org.apache.ibatis.annotations.Param;

public interface ConfigurationMapper {
    long countByExample(ConfigurationExample example);

    int deleteByExample(ConfigurationExample example);

    int insert(Configuration record);

    int insertSelective(Configuration record);

    List<Configuration> selectByExample(ConfigurationExample example);

    int updateByExampleSelective(@Param("record") Configuration record, @Param("example") ConfigurationExample example);

    int updateByExample(@Param("record") Configuration record, @Param("example") ConfigurationExample example);
}