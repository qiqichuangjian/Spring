package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Acthor:孙琪; date:2019/4/17;
 */
@Controller
@RequestMapping("china")
public class ChinaController {
    @RequestMapping("query/{sid}")
    public String queryById(@PathVariable(name="sid") String sid){
        System.out.println("id==="+sid);
        return "query";
    }
}
