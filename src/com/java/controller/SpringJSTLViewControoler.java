package com.java.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springjstlview")
public class SpringJSTLViewControoler {

    @RequestMapping("/success")
    public String toSuccess(){
        return "success";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("testRedirect");
        //重定向
        return"redirect:/success.jsp";
    }

}
