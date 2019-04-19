package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


/**
 * @Acthor:孙琪; date:2019/4/18;
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/say1")
    public String say(Model model){
        model.addAttribute("msg","我是model带来的!");
        return "hello";
    }
    @RequestMapping("/say2")
    public String say(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("msg","我是HttpServletRequest带来的!");
        return "hello";
    }
    @RequestMapping("/say3")
    public String say(Map<String,Object> map){
        map.put("msg","我是map带来的!");
        return "hello";
    }
    @RequestMapping("/say4")
    public ModelAndView say(){
        // 模型和试图控制器
        ModelAndView mv=new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg","我是ModelAndView带来的!");
        return mv;
    }
}
