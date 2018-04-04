package cn.liaohongdong.ssm.dao;

import cn.liaohongdong.ssm.BaseTest;
import cn.liaohongdong.ssm.entity.Users;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class UsersDaoTest extends BaseTest {

    @Autowired
    private UsersDao usersDao;

    @Test
    @ResponseBody
    public void find() {
        List<Users> all = usersDao.findAll();
//        List<Users> all = usersDao.findAll();
//        String s = JSON.toJSONString(all);
//        System.out.println(s);

        for(Users u: all){
            System.out.println(u.toString());
            System.out.println(u.getUserAddress().toString());
        }
    }
}
