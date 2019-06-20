package loan.easyLoan.entity;

public class ImageUpload {

    private String idCard;

    private String avatar;

    private int type; // 0表示头像，1表示身份证正面（国徽）照，2表示身份证反面（照片）照，3表示特殊认证材料

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}