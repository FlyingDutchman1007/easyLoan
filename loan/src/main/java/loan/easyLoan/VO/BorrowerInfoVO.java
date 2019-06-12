package loan.easyLoan.VO;

public class BorrowerInfoVO {
    private String phoneNumber;
    private String userName;
    private String sex;
    private String educationalLevel;
    private String marriage;
    private String profession;
    private String address;
    private String specialIdentity;

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

    public String getSpecialIdentity() {
        return specialIdentity;
    }

    public void setSpecialIdentity(String specialIdentity) {
        this.specialIdentity = specialIdentity;
    }

    public BorrowerInfoVO(String phoneNumber, String userName, String sex, String educationalLevel, String marriage, String profession, String address, String specialIdentity) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.sex = sex;
        this.educationalLevel = educationalLevel;
        this.marriage = marriage;
        this.profession = profession;
        this.address = address;
        this.specialIdentity = specialIdentity;
    }

    public BorrowerInfoVO() {
    }
}
