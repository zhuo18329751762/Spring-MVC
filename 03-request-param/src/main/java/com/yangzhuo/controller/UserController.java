package com.yangzhuo.controller;

import com.yangzhuo.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

    //pojo参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParm(User user){
        System.out.println("pojo参数传递 user ==>"+user);
        return "{'module':pojo param'}";
    }

    //嵌套pojo参数
    @RequestMapping("/pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user){
        System.out.println("pojo嵌套pojo参数传递 user ==>"+user);
        return "{'module':pojo ContainPojoParam'}";
    }
    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("数组参数传递 likes ==>"+ Arrays.toString(likes));
        return "{'module':array Param'}";
    }
    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("集合参数传递 list ==>"+ likes);
        return "{'module':list Param'}";
    }
    //集合参数:json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes){
        System.out.println("集合参数：json传递 list ==>"+ likes);
        return "{'module':pojo for json  Param'}";
    }
    //pojo参数:json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("集合参数：(pojo)json传递 user ==>"+ user);
        return "{'module':pojo for json  Param'}";
    }
    //集合参数:json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("集合参数：list(pojo)json传递 list ==>"+ list);
        return "{'module':list pojo for json  Param'}";
    }

    //日期参数
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2){
        System.out.println("参数传递 date ==>"+date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==>"+date1);
        System.out.println("参数传递 date2(yyyy/MM/dd HH:mm:ss) ==>"+date2);
        return "{'module':date Param'}";
    }
}
