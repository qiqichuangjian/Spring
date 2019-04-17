package com.java.controller;

import com.java.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @Acthor:孙琪; date:2019/4/17;
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static List<User> list = new ArrayList<>();

    //静态代码块
    static {
        list.add(new User(1, "aaa111", "aaa111"));
        list.add(new User(2, "222223", "222222"));
        list.add(new User(3, "333333", "333333"));
    }

    @RequestMapping("/query1")
    public String query1(Model model) {
        model.addAttribute("lists", list);
        //在views/user/query.jsp里
        return "/user/query";
    }

    //写法2
    @RequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("lists", list);
        return "/user/query";
    }


	/*带占位符的URL是Spring3.0（含）后新增的功能，这个功能在SpringMVC向REST目标挺近发展过程中具有里程碑意义。
    通过@PathVariable可以将URL中占位符参数绑定到控制器处理方法的入参中：
    URL中的{XXX}占位符可以通过@PathVariable(“xxx”)绑定到操作方法的入参中。*/
    //@PathVariable可以映射URL中的占位符到目标方法中
    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id) {
        System.out.println("delete......" + id);
        User user = null;
        for (User u : list) {
            if (u.getId().equals(id)) {
                user = u;//移除时，如果两id相同就去移除,不然+1再比较，直到id相同跳出去移除
                break;
            }
        }
        list.remove(user);
        //redirect:重定向
        return "redirect:/user/query";
    }

    @RequestMapping(value = "/update/{id}")
    public ModelAndView toupdate(@PathVariable(name = "id") Integer id) {
        User user1 = null;
        for (User u : list) {
            if (u.getId().equals(id)) {
                user1 = u;
                break;
            }
        }
        ModelAndView mv = new ModelAndView("/user/update");
        mv.addObject("user", user1);
        return mv;//返回修改对象
    }

    @RequestMapping(value = "/updateUser")
    public String updateUser(User user) {
        System.out.println("post......" + user);
        //真正的最大id=(list.size()-1)最大索引的id + 1
        //index0,1,2...    id1,2,3...
        Integer id = list.get(list.size()-1).getId() + 1;
        //index索引-1不存在
        //初始化index不为任何值
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(user.getId())) {
                index = i;
            }
        }
        if (index != -1) {
            list.set(index, user);//修改
        }
        return "redirect:/user/query";
    }

    @RequestMapping(value = "/toadd")
    public String queryOne() {
        //转发
        return "forward:/WEB-INF/views/user/add.jsp";
    }

    @RequestMapping(value = "/save")
    public String add(User user) {
        System.out.println("post......" + "username:" + user.getUsername() + "......." + "password:" + user.getPassword());
        Integer id = list.get(list.size() - 1).getId() + 1;
        user.setId(id);
        list.add(user);
        return "redirect:/user/query";
    }

}
