package loan.easyLoan.mapper;

import loan.easyLoan.entity.Trade;

public interface TradeMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}