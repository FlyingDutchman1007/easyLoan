package loan.easyLoan.mapper;

import loan.easyLoan.entity.Configuration;

public interface ConfigurationMapper {
    int insert(Configuration record);

    int insertSelective(Configuration record);
}