package loan.easyLoan.service.impl;

import loan.easyLoan.entity.Configuration;
import loan.easyLoan.mapper.ConfigurationMapper;
import loan.easyLoan.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/11 8:42
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationMapper configurationMapper;

    @Override
    public boolean insertParameter(Configuration configuration) {
        int result =  configurationMapper.insertParameter(configuration);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean updateParameter(Configuration configuration) {
        int result =  configurationMapper.updateParameter(configuration);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String selectParameter(String parameterName) {
        return configurationMapper.selectParameter(parameterName);
    }
}
