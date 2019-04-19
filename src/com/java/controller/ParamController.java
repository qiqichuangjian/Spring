package com.java.controller;

import com.java.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/ParamController")
public class ParamController {

    private final String SUCCESS="success";

    @RequestMapping("/param")
    public String param(@RequestParam(value="name",required = false,defaultValue="amdin") String name,
                        @RequestParam(value="age") String age){
        System.out.println("ParamController.param....."+"name="+name+" | age="+age);
        return SUCCESS;
    }


    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept-Language") String al){
        System.out.println("testRequestHeader:"+al);//testRequestHeader:zh-CN,zh;q=0.9
        return SUCCESS;
    }
    @RequestMapping("/addCookie")
    public String addCookie(HttpServletResponse response){
        System.out.println("addCookie...");
        Cookie cookie1 = new Cookie("username","username_aaa111");
        cookie1.setMaxAge(60*60);//秒
        //所以关了浏览器后开getCookie，username...username_aaa111   因为保持一个小时  password...null
        Cookie cookie2 = new Cookie("password","password_aaa111");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return SUCCESS;
    }

    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue(value="username") String username,
                            @CookieValue(value="password",required = false) String password){
        System.out.println("getCookie...username..."+username);
        System.out.println("getCookie...password..."+password);
        return SUCCESS;
    }

    @RequestMapping("/testPojo")  //先在表单里添加数据
    public String testPojo(User user){
        System.out.println(user.getUsername()+"\t"+ user.getPassword()+"\t"
                +user.getEmail()+"\t"+user.getAge()+"\t"
                +user.getAddress().getProvince()+"\t"+user.getAddress().getCity());
        return SUCCESS;
    }

}
