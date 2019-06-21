package loan.easyLoan.VO;

public class LenderInfoVO {
    private String phoneNumber;
    private String userName;
    private String sex;
    private String educationalLevel;
    private String marriage;
    private String profession;
    private String address;

    public LenderInfoVO(){}

    public LenderInfoVO(String phoneNumber, String userName, String sex, String educationalLevel, String marriage, String profession, String address) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.sex = sex;
        this.educationalLevel = educationalLevel;
        this.marriage = marriage;
        this.profession = profession;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "LenderInfoVO{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", educationalLevel='" + educationalLevel + '\'' +
                ", marriage='" + marriage + '\'' +
                ", profession='" + profession + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
>>>>>>> Ywr470832459-patch-1
}