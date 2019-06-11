package loan.easyLoan.mapper;

import loan.easyLoan.entity.Trade;
import org.springframework.stereotype.Component;

/**
 * @author Ywr
 * @date 2019/6/8 16:38
 */
@Component
public interface TradeMapper {
    int deleteByPrimaryKey(Integer serialNumber);

    int insert(Trade record);

    int insertSelective(Trade record);

    Trade selectByPrimaryKey(Integer serialNumber);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}