package cn.liaohongdong.ssm.service.impl;

import cn.liaohongdong.ssm.dao.UsersDao;
import cn.liaohongdong.ssm.entity.Users;
import cn.liaohongdong.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    public List<Users> findAll() {
        return usersDao.findAll();
    }
}
