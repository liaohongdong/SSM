package cn.liaohongdong.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Users {
    private int userId;
    private String username;
    private String password;
    private int qq;
    private String wechat;
    private String email;
    private String mobile;
    private String province;
    private String city;
    private String area;
    private String address;
    private String nickname;
    private int level;
    private String order;
    private int sex;
    private Date birthday;
    private BigDecimal userMoney;
    private BigDecimal frozenoney;
    private int payPoints;
    private int rankPoints;
    private int addressId;
    private int regTime;
    private int lastLogin;
    private Date lastTime;
    private String lastIp;
    private int isSpecial;
    private int parentId;
    private int falg;
    private int isValidated;
    private BigDecimal maxConsumption;
    private int vip1;
    private int vip2;
    private int vip3;
    private int vip4;
    private int vip5;
    private int vip6;
    private UserAddress userAddress;

    public Users() {
    }

    public Users(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Users(int userId, String username, String password, int qq, String wechat, String email, String mobile, String province, String city, String area, String address, String nickname, int level, String order, int sex, Date birthday, BigDecimal userMoney, BigDecimal frozenoney, int payPoints, int rankPoints, int addressId, int regTime, int lastLogin, Date lastTime, String lastIp, int isSpecial, int parentId, int falg, int isValidated, BigDecimal maxConsumption, int vip1, int vip2, int vip3, int vip4, int vip5, int vip6, UserAddress userAddress) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.qq = qq;
        this.wechat = wechat;
        this.email = email;
        this.mobile = mobile;
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.nickname = nickname;
        this.level = level;
        this.order = order;
        this.sex = sex;
        this.birthday = birthday;
        this.userMoney = userMoney;
        this.frozenoney = frozenoney;
        this.payPoints = payPoints;
        this.rankPoints = rankPoints;
        this.addressId = addressId;
        this.regTime = regTime;
        this.lastLogin = lastLogin;
        this.lastTime = lastTime;
        this.lastIp = lastIp;
        this.isSpecial = isSpecial;
        this.parentId = parentId;
        this.falg = falg;
        this.isValidated = isValidated;
        this.maxConsumption = maxConsumption;
        this.vip1 = vip1;
        this.vip2 = vip2;
        this.vip3 = vip3;
        this.vip4 = vip4;
        this.vip5 = vip5;
        this.vip6 = vip6;
        this.userAddress = userAddress;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public BigDecimal getFrozenoney() {
        return frozenoney;
    }

    public void setFrozenoney(BigDecimal frozenoney) {
        this.frozenoney = frozenoney;
    }

    public int getPayPoints() {
        return payPoints;
    }

    public void setPayPoints(int payPoints) {
        this.payPoints = payPoints;
    }

    public int getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(int rankPoints) {
        this.rankPoints = rankPoints;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getRegTime() {
        return regTime;
    }

    public void setRegTime(int regTime) {
        this.regTime = regTime;
    }

    public int getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(int lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public int getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(int isSpecial) {
        this.isSpecial = isSpecial;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getFalg() {
        return falg;
    }

    public void setFalg(int falg) {
        this.falg = falg;
    }

    public int getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(int isValidated) {
        this.isValidated = isValidated;
    }

    public BigDecimal getMaxConsumption() {
        return maxConsumption;
    }

    public void setMaxConsumption(BigDecimal maxConsumption) {
        this.maxConsumption = maxConsumption;
    }

    public int getVip1() {
        return vip1;
    }

    public void setVip1(int vip1) {
        this.vip1 = vip1;
    }

    public int getVip2() {
        return vip2;
    }

    public void setVip2(int vip2) {
        this.vip2 = vip2;
    }

    public int getVip3() {
        return vip3;
    }

    public void setVip3(int vip3) {
        this.vip3 = vip3;
    }

    public int getVip4() {
        return vip4;
    }

    public void setVip4(int vip4) {
        this.vip4 = vip4;
    }

    public int getVip5() {
        return vip5;
    }

    public void setVip5(int vip5) {
        this.vip5 = vip5;
    }

    public int getVip6() {
        return vip6;
    }

    public void setVip6(int vip6) {
        this.vip6 = vip6;
    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", qq=" + qq +
                ", wechat='" + wechat + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", address='" + address + '\'' +
                ", nickname='" + nickname + '\'' +
                ", level=" + level +
                ", order='" + order + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", userMoney=" + userMoney +
                ", frozenoney=" + frozenoney +
                ", payPoints=" + payPoints +
                ", rankPoints=" + rankPoints +
                ", addressId=" + addressId +
                ", regTime=" + regTime +
                ", lastLogin=" + lastLogin +
                ", lastTime=" + lastTime +
                ", lastIp='" + lastIp + '\'' +
                ", isSpecial=" + isSpecial +
                ", parentId=" + parentId +
                ", falg=" + falg +
                ", isValidated=" + isValidated +
                ", maxConsumption=" + maxConsumption +
                ", vip1=" + vip1 +
                ", vip2=" + vip2 +
                ", vip3=" + vip3 +
                ", vip4=" + vip4 +
                ", vip5=" + vip5 +
                ", vip6=" + vip6 +
                ", userAddress=" + userAddress +
                '}';
    }
}
