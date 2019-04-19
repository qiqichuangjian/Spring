package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//编写测试类
@Controller
@RequestMapping("springmvc")
public class SpringViewExcelTest {

    private static String SUCCESS="success";
    @RequestMapping("/testView")
    public String testView(){
        System.out.println();
        return  "helloView";
    }

}
