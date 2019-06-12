package loan.easyLoan.service;

import loan.easyLoan.entity.UserOptionalInfo;

public interface UserService {
    //通过用户ID获取用户对象的方法
    UserOptionalInfo getUserById(String id);
}
