package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;

import cn.liaohongdong.ssm.entity.Users;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestUsers extends BaseTest {
    @Autowired
    private UsersDao usersDao;

    @Test
    public void findByName() {
        Users liao = usersDao.findByName("liao");
        System.out.println(liao);
    }
}
