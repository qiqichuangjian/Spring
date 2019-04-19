package com.java.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Map;

/**
 * @Acthor:孙琪; date:2019/4/19;
 */
//新建视图，并实现View接口
@Component
public class HelloView implements View {
    public String getContentType() {
        //内容类型
        return  "text/html";
    }
    public void render(Map<String, ?> arg0, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 页面输出   out
        response.getWriter().print("hello view,time:"+new Date());
    }
}