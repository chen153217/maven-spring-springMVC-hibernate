package com.test.controller;

import com.test.dao.UserDao;
import com.test.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenhansen on 2017/9/17.
 */
@Controller
@RequestMapping("/test")
public class UserController {
    @RequestMapping("/user")
    @ResponseBody //表示直接输出返回内容，不进行jsp或html跳转，本例是为了写接口，这里直接返回json
    public List<UserEntity> getUser(){
        UserDao dao=new UserDao();
        return dao.query();
    }
/*public UserTest getUser(){
        UserTest user=new UserTest("jack","123456");
        return user;

    }*/
}
