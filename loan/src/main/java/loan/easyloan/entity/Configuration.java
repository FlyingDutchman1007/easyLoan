package loan.easyLoan.entity;


public class Configuration {

  private String parameterName;
  private String parameterValue;


  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }

  @Override
  public String toString() {
    return "Configuration{" +
            "parameterName='" + parameterName + '\'' +
            ", parameterValue='" + parameterValue + '\'' +
            '}';
  }
}
