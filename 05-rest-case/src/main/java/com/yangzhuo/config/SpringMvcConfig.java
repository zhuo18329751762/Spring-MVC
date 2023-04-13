package com.yangzhuo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration//表示这是一个配置类
@ComponentScan({"com.yangzhuo.controller","com.yangzhuo.config"})//扫描范围
@EnableWebMvc//json数据转换为对象
public class SpringMvcConfig {
}
