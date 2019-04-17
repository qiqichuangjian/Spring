package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Acthor:孙琪; date:2019/4/17;
 */
@Controller
public class HelloController {
    //这个hello方法需要有一个应答请求
    /**
     * 1、使用RequestMapping注解来映射请求的URL
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于InternalResourceViewResolver而言，
     * 视图解析器会做如下的解析：
     * 2.1、通过prefix + returnVal + 后缀这样的方式得到实际的物理视图，然后做转发操作。
     * 	如：/WEB-INF/views/hello1.jsp
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("helloworld");
        return"hello";
    }

    @RequestMapping("/helloworld")
    public String hello(Model model){
        model.addAttribute("helloMsg","SpringMVC你好，很高兴认识你");
        return "hello1";
    }
}