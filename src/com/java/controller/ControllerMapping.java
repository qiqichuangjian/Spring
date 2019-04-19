package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Acthor:孙琪; date:2019/4/18;
 */
@Controller
@RequestMapping("/ControllerMapping")
public class ControllerMapping {
    private final String SUCCESS = "success";

    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod....");
        return SUCCESS;
    }

    /*测试Params参数params表示要传递的参数，name表示传递的第一个参数，值不确定，第二个参数是age并且年龄不能是等于10的 */
    @RequestMapping(value="testParamaAndHeaders",params={"name","age!=10"})
    public String testParamaAndHeaders(){
        System.out.println("testParamaAndHeaders");
        return SUCCESS;
    }

    /*测试header请求头信息 */
    @RequestMapping(value="testHeaders",params={"name","age!=10"},headers={"Accept-Language=zh-CN,zh;q=0.9"})
    //headers={"Accept-Language=zh-CN,zh;q=0.9"}在报文里看，没什么用
    public String testHeaders(){
        System.out.println("testParamaAndHeaders");
        return SUCCESS;
    }

    /*
     * 测试Ant格式请求路径
     * ? 代表一个字符
     * */
    @RequestMapping(value="testAnt/abc??")
    public String testAnt1(){
        System.out.println("testAnt/abc??");
        return SUCCESS;
    }
    /*
     * 测试Ant格式请求路径
     * * 代表一个路径
     * */
    @RequestMapping(value="testAnt/*/abc")
    public String testAnt2(){
        System.out.println("testAnt/*/abc");
        return SUCCESS;
    }
    /*
     * 测试Ant格式请求路径
     * ** 代表多层路径
     * */
    @RequestMapping(value="testAnt/**/abc")
    public String testAnt3(){
        System.out.println("testAnt/**/abc");
        return SUCCESS;
    }
    @RequestMapping(value="delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id){
        System.out.println("delete....."+id);
        return SUCCESS;
    }

}
