package loan.easyLoan.entity;


public class UserRequiredInfo {

  private String phoneNumber;
  private String idCard;
  private String userName;
  private String bankAccount;
  private int userType;
  private String password;


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(String bankAccount) {
    this.bankAccount = bankAccount;
  }


  public int getUserType() {
    return userType;
  }

  public void setUserType(int userType) {
    this.userType = userType;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserRequiredInfo{" +
            "phoneNumber='" + phoneNumber + '\'' +
            ", idCard='" + idCard + '\'' +
            ", userName='" + userName + '\'' +
            ", bankAccount='" + bankAccount + '\'' +
            ", userType=" + userType +
            ", password='" + password + '\'' +
            '}';
  }
}
