package loan.easyLoan.service.impl;

import loan.easyLoan.entity.Depository;
import loan.easyLoan.mapper.DepositoryMapper;
import loan.easyLoan.service.DepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ywr
 * @date 2019/6/10 21:07
 */
@Service
public class DepositoryServiceImpl implements DepositoryService {

    @Autowired
    private DepositoryMapper depositoryMapper;

    @Override
    public boolean addNewDepository(Depository depository) {
        int result =  depositoryMapper.addNewDepository(depository);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }
}
