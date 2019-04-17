package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Acthor:孙琪; date:2019/4/17;
 */
@Controller
/*
结论：
        1、@RequestMapping除了可以修饰方法还可以修饰类。
        2、在类定义处：提供初步的请求映射信息，相对于WEB应用的根目录。
        3、在方法处：提供进一步的细分映射信息，相对于类定义处的URL。若类定义处为标记@RequestMapping，则方法处标记的URL相对于WEB应用的根目录。
*/
@RequestMapping("/model")
public class ModelController {
    @RequestMapping("/query")
    public ModelAndView queryModel(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","这是一个model");
        modelAndView.setViewName("model");
        return modelAndView;
    }
    @RequestMapping(value="testParamaAndHeaders1",params={"username","age!=10"})
    public String testParamaAndHeaders(){
        System.out.println("testParamaAndHeaders1");
        return "success";
    }

    @RequestMapping(value="testParamaAndHeaders2",params={"username","age!=10"})
    public String testParamaAndHeaders(@RequestParam(name="username") String username){
        System.out.println("testParamaAndHeaders2");
        System.out.println("username-----------"+username);
        return "success";
    }
    @RequestMapping(value="testParamaAndHeaders3",params={"username","age!=10"})
    public String testParamaAndHeaders(@RequestParam(name="username") String username,@RequestParam(name = "age") Integer age){
        System.out.println("testParamaAndHeaders3");
        System.out.println("username-----------"+username);
        System.out.println("age-----------"+age);
        return "success";
    }
    @RequestMapping(value="testParama")                        // required = false  验证 默认true,false时不需要在网址栏填属性信息
    public String testParama(@RequestParam(name="username" ,required = false) String username){
        System.out.println("testParama");
        //但填上也可以   如果a href="/model/testParama?username=111     username-----------111
        System.out.println("username-----------"+username);
        //如果a href="/model/testParama username-----------null
        return "success";
    }
    @RequestMapping(value="testAnt/**/abc")
    public String testAnt(){
        System.out.println("testAntPath");
        return "success";
    }
    @RequestMapping(value="test/a??")
    public String test(){
        System.out.println("test");
        return "success";
    }

}
