package com.java.controller;

import com.java.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/JsonController")
public class JsonController {

    @RequestMapping("/jsonTest")
    @ResponseBody  // ajax  异步请求
    public User jsonTest(){
        User user =  new User("admin111","123456");
        return user;
    }

}