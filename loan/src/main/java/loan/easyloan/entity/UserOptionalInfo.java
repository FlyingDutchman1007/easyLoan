package loan.easyLoan.entity;


public class UserOptionalInfo {

  private String idCard;
  private String sex;
  private String educationalLevel;
  private String marriage;
  private String profession;
  private String address;
  private byte[] avatar;
  private String specialIdentity;


  public String getIdCard() {
    return idCard;
  }

  public void setIdCard(String idCard) {
    this.idCard = idCard;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getEducationalLevel() {
    return educationalLevel;
  }

  public void setEducationalLevel(String educationalLevel) {
    this.educationalLevel = educationalLevel;
  }


  public String getMarriage() {
    return marriage;
  }

  public void setMarriage(String marriage) {
    this.marriage = marriage;
  }


  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public byte[] getAvatar() {
    return avatar;
  }

  public void setAvatar(byte[] avatar) {
    this.avatar = avatar;
  }


  public String getSpecialIdentity() {
    return specialIdentity;
  }

  public void setSpecialIdentity(String specialIdentity) {
    this.specialIdentity = specialIdentity;
  }

  @Override
  public String toString() {
    return "UserOptionalInfo{" +
            "idCard='" + idCard + '\'' +
            ", sex='" + sex + '\'' +
            ", educationalLevel='" + educationalLevel + '\'' +
            ", marriage='" + marriage + '\'' +
            ", profession='" + profession + '\'' +
            ", address='" + address + '\'' +
            ", avatar='" + avatar + '\'' +
            ", specialIdentity='" + specialIdentity + '\'' +
            '}';
  }
}
