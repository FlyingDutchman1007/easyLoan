package loan.easyLoan.entity;


public class Depository {

  private String fundsAccount;
  private String depositoryAccount;


  public String getFundsAccount() {
    return fundsAccount;
  }

  public void setFundsAccount(String fundsAccount) {
    this.fundsAccount = fundsAccount;
  }


  public String getDepositoryAccount() {
    return depositoryAccount;
  }

  public void setDepositoryAccount(String depositoryAccount) {
    this.depositoryAccount = depositoryAccount;
  }

  @Override
  public String toString() {
    return "Depository{" +
            "fundsAccount='" + fundsAccount + '\'' +
            ", depositoryAccount='" + depositoryAccount + '\'' +
            '}';
  }
}
