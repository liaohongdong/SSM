package cn.liaohongdong.ssm.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Users 用户实体
 */
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

    private String sex;

    private Date birthday;

    private BigDecimal user_money;

    private BigDecimal frozen_money;

    private int pay_points;

    private int rank_points;

    private int address_id;

    private int reg_time;

    private int last_login;

    private Date last_time;

    private String last_ip;

    private int is_special;

    private int parent_id;

    private int flag;

    private int is_validated;

    private BigDecimal max_consumption;

    private int vip_1;

    private int vip_2;

    private int vip_3;

    private int vip_4;

    private int vip_5;

    private int vip_6;

    private UserAddress userAddress;

    public Users() {
    }

    public Users(int userId, String username, String password, int qq, String wechat, String email, String mobile, String province, String city, String area, String address, String nickname, int level, String order, String sex, Date birthday, BigDecimal user_money, BigDecimal frozen_money, int pay_points, int rank_points, int address_id, int reg_time, int last_login, Date last_time, String last_ip, int is_special, int parent_id, int flag, int is_validated, BigDecimal max_consumption, int vip_1, int vip_2, int vip_3, int vip_4, int vip_5, int vip_6) {
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
        this.user_money = user_money;
        this.frozen_money = frozen_money;
        this.pay_points = pay_points;
        this.rank_points = rank_points;
        this.address_id = address_id;
        this.reg_time = reg_time;
        this.last_login = last_login;
        this.last_time = last_time;
        this.last_ip = last_ip;
        this.is_special = is_special;
        this.parent_id = parent_id;
        this.flag = flag;
        this.is_validated = is_validated;
        this.max_consumption = max_consumption;
        this.vip_1 = vip_1;
        this.vip_2 = vip_2;
        this.vip_3 = vip_3;
        this.vip_4 = vip_4;
        this.vip_5 = vip_5;
        this.vip_6 = vip_6;
    }

    public Users(int userId, String username, String password, int qq, String wechat, String email, String mobile, String province, String city, String area, String address, String nickname, int level, String order, String sex, Date birthday, BigDecimal user_money, BigDecimal frozen_money, int pay_points, int rank_points, int address_id, int reg_time, int last_login, Date last_time, String last_ip, int is_special, int parent_id, int flag, int is_validated, BigDecimal max_consumption, int vip_1, int vip_2, int vip_3, int vip_4, int vip_5, int vip_6, UserAddress userAddress) {
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
        this.user_money = user_money;
        this.frozen_money = frozen_money;
        this.pay_points = pay_points;
        this.rank_points = rank_points;
        this.address_id = address_id;
        this.reg_time = reg_time;
        this.last_login = last_login;
        this.last_time = last_time;
        this.last_ip = last_ip;
        this.is_special = is_special;
        this.parent_id = parent_id;
        this.flag = flag;
        this.is_validated = is_validated;
        this.max_consumption = max_consumption;
        this.vip_1 = vip_1;
        this.vip_2 = vip_2;
        this.vip_3 = vip_3;
        this.vip_4 = vip_4;
        this.vip_5 = vip_5;
        this.vip_6 = vip_6;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getUser_money() {
        return user_money;
    }

    public void setUser_money(BigDecimal user_money) {
        this.user_money = user_money;
    }

    public BigDecimal getFrozen_money() {
        return frozen_money;
    }

    public void setFrozen_money(BigDecimal frozen_money) {
        this.frozen_money = frozen_money;
    }

    public int getPay_points() {
        return pay_points;
    }

    public void setPay_points(int pay_points) {
        this.pay_points = pay_points;
    }

    public int getRank_points() {
        return rank_points;
    }

    public void setRank_points(int rank_points) {
        this.rank_points = rank_points;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getReg_time() {
        return reg_time;
    }

    public void setReg_time(int reg_time) {
        this.reg_time = reg_time;
    }

    public int getLast_login() {
        return last_login;
    }

    public void setLast_login(int last_login) {
        this.last_login = last_login;
    }

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public String getLast_ip() {
        return last_ip;
    }

    public void setLast_ip(String last_ip) {
        this.last_ip = last_ip;
    }

    public int getIs_special() {
        return is_special;
    }

    public void setIs_special(int is_special) {
        this.is_special = is_special;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getIs_validated() {
        return is_validated;
    }

    public void setIs_validated(int is_validated) {
        this.is_validated = is_validated;
    }

    public BigDecimal getMax_consumption() {
        return max_consumption;
    }

    public void setMax_consumption(BigDecimal max_consumption) {
        this.max_consumption = max_consumption;
    }

    public int getVip_1() {
        return vip_1;
    }

    public void setVip_1(int vip_1) {
        this.vip_1 = vip_1;
    }

    public int getVip_2() {
        return vip_2;
    }

    public void setVip_2(int vip_2) {
        this.vip_2 = vip_2;
    }

    public int getVip_3() {
        return vip_3;
    }

    public void setVip_3(int vip_3) {
        this.vip_3 = vip_3;
    }

    public int getVip_4() {
        return vip_4;
    }

    public void setVip_4(int vip_4) {
        this.vip_4 = vip_4;
    }

    public int getVip_5() {
        return vip_5;
    }

    public void setVip_5(int vip_5) {
        this.vip_5 = vip_5;
    }

    public int getVip_6() {
        return vip_6;
    }

    public void setVip_6(int vip_6) {
        this.vip_6 = vip_6;
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
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", user_money=" + user_money +
                ", frozen_money=" + frozen_money +
                ", pay_points=" + pay_points +
                ", rank_points=" + rank_points +
                ", address_id=" + address_id +
                ", reg_time=" + reg_time +
                ", last_login=" + last_login +
                ", last_time=" + last_time +
                ", last_ip='" + last_ip + '\'' +
                ", is_special=" + is_special +
                ", parent_id=" + parent_id +
                ", flag=" + flag +
                ", is_validated=" + is_validated +
                ", max_consumption=" + max_consumption +
                ", vip_1=" + vip_1 +
                ", vip_2=" + vip_2 +
                ", vip_3=" + vip_3 +
                ", vip_4=" + vip_4 +
                ", vip_5=" + vip_5 +
                ", vip_6=" + vip_6 +
                '}';
    }
}
