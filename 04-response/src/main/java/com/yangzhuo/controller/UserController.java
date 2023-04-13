package com.yangzhuo.controller;

import com.yangzhuo.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


@Controller
public class UserController {
    //响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }
    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }
    //响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("zhangsan");
        user.setId(15);
        return user;
    }
    //响应POJO集合对象
    @RequestMapping("/toJsonList")
    @ResponseBody//设置返回值类型
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user = new User();
        user.setName("zhangsan");
        user.setId(15);
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setId(15);
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        return list;
    }
}
