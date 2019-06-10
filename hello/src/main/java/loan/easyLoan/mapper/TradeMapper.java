package loan.easyLoan.mapper;

import java.util.List;
import loan.easyLoan.entity.Trade;
import loan.easyLoan.entity.TradeExample;
import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    long countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Integer serialNumber);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Integer serialNumber);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}