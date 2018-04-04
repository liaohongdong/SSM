package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.entity.Users;

import java.util.List;

public interface UsersDao {
    List<Users> findAll();
}
