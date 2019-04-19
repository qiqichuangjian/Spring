package com.java.controller;

import com.java.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
//作用：浏览器不关，跨页面，开始index.jsp里UserSession:${user}为空，执行完第一个方法后，有值
@SessionAttributes(value={"user"})//根据名字
//@SessionAttributes(types = User.class) //根据类型
@Controller
@RequestMapping("/model")
public class ModelController {
    // 强装user入session中
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Map<String, Object> map) {
        User user = new User("username111", "password111");
        map.put("user", user);
        return "success";
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        //请求地址
        String viewName = "success";
        // 创建模型视图对象
        //ModelAndView modelAndView = new ModelAndView(viewName);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(viewName);
        modelAndView.addObject("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("time", "model:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("time", "map:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap map) {
        map.put("time", "modelMap:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "success";
    }

}
