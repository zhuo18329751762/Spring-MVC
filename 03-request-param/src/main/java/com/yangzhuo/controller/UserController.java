package com.yangzhuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 2 定义controller
// 2.1使用@Controller定义bean
@Controller
public class UserController {
    //2.2 设置当前操作的访问路径
    @RequestMapping("/commonParam")
    //2.3 设置当前操作的返回值类型
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==>"+name);
        System.out.println("普通参数传递 age ==>"+age);
        System.out.println("user save ...");
        return "{'module':'springmvc'}";
    }
}
