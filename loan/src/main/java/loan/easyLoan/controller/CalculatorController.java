package loan.easyLoan.controller;

import io.swagger.annotations.ApiOperation;
import loan.easyLoan.entity.CalculateTable;
import loan.easyLoan.service.impl.RateCalculator;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/22 11:16
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class CalculatorController {
    private RateCalculator rateCalculator = new RateCalculator();

    @ApiOperation(value = "利息计算器")
    @PostMapping(value = "/rateCalculator", produces = "application/json;charset=UTF-8")
    public List<CalculateTable> rateCalculate(@RequestBody Map obj) {
        double lendMoney = Double.parseDouble((String) obj.get("lendMoney"));
        float payRate = Float.parseFloat((String) obj.get("payRate"));
        int limitMonths = Integer.parseInt((String) obj.get("limitMonths"));
        int payType = Integer.parseInt((String) obj.get("payType"));
        int rateCalculateType = Integer.parseInt((String) obj.get("rateCalculateType"));//1-等额本息，2-等额本金，3-等本等息
        List<CalculateTable> calculateTableList = rateCalculator.calculate(lendMoney, payRate, limitMonths, payType, rateCalculateType);
        if (calculateTableList.isEmpty()) {
            return null;
        } else {
            return calculateTableList;
        }
    }
}