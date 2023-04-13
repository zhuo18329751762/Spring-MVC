package com.yangzhuo.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//声明这是一个异常处理类
public class ProjectExceptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        System.out.println("拦截到异常");
        return new Result(666,null);
    }
}
