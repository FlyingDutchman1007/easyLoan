package loan.easyLoan.service;

import loan.easyLoan.entity.Configuration;

/**
 * @author Ywr
 * @date 2019/6/11 8:42
 */
public interface ConfigurationService {

    boolean insertParameter(Configuration configuration);//插入参数

    boolean updateParameter(Configuration configuration);//修改参数

    String selectParameter(String parameterName);//查找参数
}
