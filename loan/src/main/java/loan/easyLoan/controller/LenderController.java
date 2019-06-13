package loan.easyLoan.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import loan.easyLoan.service.IntendLendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Ywr
 * @date 2019/6/13 13:21
 */
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
@RestController
@RequestMapping
public class LenderController {

    /*@Autowired
    private IntendLendService intendLendService;

    @Autowired
    private HttpServletRequest httpServletRequest;


    @ApiImplicitParams({
            @ApiImplicitParam(name="intendMoney",value="意向金额",paramType="json"),
            @ApiImplicitParam(name="startDate",value="借款日期",paramType="json"),
            @ApiImplicitParam(name="payRate",value="借款利率",paramType="json"),
            @ApiImplicitParam(name="payType",value="借款类型",paramType="json"),
            @ApiImplicitParam(name="limitMonths",value="借款时长",paramType="json")
    })
    @ApiOperation(value = "意向借入",notes = "意向借入接口")
    @PostMapping(value = "/subBorrow", produces = "application/json;charset=UTF-8")
    public void subLend(@RequestBody Map obj){

    }*/

}
