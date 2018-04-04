package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.entity.Users;

import java.util.List;

public interface UsersDao {

    Users findByName(String name);

    List<Users> findAll();

    List<Users> findAllPage(String page, String limit);

    int insert();

    int deleteById(int user_id);
}
