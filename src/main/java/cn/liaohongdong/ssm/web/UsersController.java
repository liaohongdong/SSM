package cn.liaohongdong.ssm.web;

import cn.liaohongdong.ssm.entity.Users;
import cn.liaohongdong.ssm.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Users> findAll() {
        return usersService.findAll();
    }
}
