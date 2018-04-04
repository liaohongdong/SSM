package cn.liaohongdong.ssm.entity;

public class UserAddress {
    private int addressId;
    private String addressName;
    private int userId;
    private String consignee;
    private String email;
    private int country;
    private String province;
    private String city;
    private String area;
    private String address;
    private int mobile;
    private String bestTime;

    public UserAddress() {
    }

    public UserAddress(int addressId, String addressName, int userId, String consignee, String email, int country, String province, String city, String area, String address, int mobile, String bestTime) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.userId = userId;
        this.consignee = consignee;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.mobile = mobile;
        this.bestTime = bestTime;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getBestTime() {
        return bestTime;
    }

    public void setBestTime(String bestTime) {
        this.bestTime = bestTime;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "addressId=" + addressId +
                ", addressName='" + addressName + '\'' +
                ", userId=" + userId +
                ", consignee='" + consignee + '\'' +
                ", email='" + email + '\'' +
                ", country=" + country +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                ", bestTime='" + bestTime + '\'' +
                '}';
    }
}
