package com.yangzhuo.controller;

import com.yangzhuo.domain.Book;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")//映射路径
public class BookController {


    @PostMapping
    public String save(@RequestBody  Book book){
        System.out.println("book save ==>"+book);
        return "{'module':'book save success'}";
    }
    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll is running ...");
        List<Book> bookList=new ArrayList<>();
        Book b1=new Book();
        b1.setType("计算机");
        b1.setName("SpringMVC实战教程");
        b1.setDescription("小试牛刀");
        Book b2=new Book();
        b2.setType("汉堡");
        b2.setName("老八秘制小汉堡");
        b2.setDescription("奥利给，干了兄弟们!");
        bookList.add(b1);
        bookList.add(b2);
        return bookList;
    }
}
