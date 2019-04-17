package com.java.controller;

import com.java.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Acthor:孙琪; date:2019/4/17;
 */
@Controller
@RequestMapping("/list")
public class ListController {
    @RequestMapping("/add")
    public String toAdd(User user){
        System.out.println("add...."+user);
        return "add";
    }
}
