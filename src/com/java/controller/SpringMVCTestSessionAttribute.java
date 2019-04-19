package com.java.controller;

import com.java.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@SessionAttributes(value={"user"})//根据名字
//@SessionAttributes(types = User.class) //根据类型
@Controller
@RequestMapping("/springmvc")
public class SpringMVCTestSessionAttribute {

    private static final String SUCCESS="success";

	@ModelAttribute //springmvc提前访问ModelAttribute给controller
	public void getUser(@RequestParam(value="id",required=false) Integer id
			, Map<String,Object> map){
		if(id != null){
			//是进行修改的
			User user = new User(1,"rrr", "chinasofti", "123456", 13);
			System.out.println("查询到的数据"+user);
		    //存放在map中
			map.put("user", user);
		}
	}

	@RequestMapping("/testSessionAttribute")//获取session中的数据
	public String testSessionAttribute(User user){
		System.out.println(user);
		return  SUCCESS;
	}
}