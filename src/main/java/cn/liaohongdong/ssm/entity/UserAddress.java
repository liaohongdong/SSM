package cn.liaohongdong.ssm.entity;

public class UserAddress {

    private int address_id;

    private int address_name;

    private int user_id;

    private int consignee;

    private int email;

    private int country;

    private int province;

    private int city;

    private int area;

    private int address;

    private int mobile;

    private int best_time;

    public UserAddress() {
    }

    public UserAddress(int address_id, int address_name, int user_id, int consignee, int email, int country, int province, int city, int area, int address, int mobile, int best_time) {
        this.address_id = address_id;
        this.address_name = address_name;
        this.user_id = user_id;
        this.consignee = consignee;
        this.email = email;
        this.country = country;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.mobile = mobile;
        this.best_time = best_time;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getAddress_name() {
        return address_name;
    }

    public void setAddress_name(int address_name) {
        this.address_name = address_name;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getConsignee() {
        return consignee;
    }

    public void setConsignee(int consignee) {
        this.consignee = consignee;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getProvince() {
        return province;
    }

    public void setProvince(int province) {
        this.province = province;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getBest_time() {
        return best_time;
    }

    public void setBest_time(int best_time) {
        this.best_time = best_time;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "address_id=" + address_id +
                ", address_name=" + address_name +
                ", user_id=" + user_id +
                ", consignee=" + consignee +
                ", email=" + email +
                ", country=" + country +
                ", province=" + province +
                ", city=" + city +
                ", area=" + area +
                ", address=" + address +
                ", mobile=" + mobile +
                ", best_time=" + best_time +
                '}';
    }
}
