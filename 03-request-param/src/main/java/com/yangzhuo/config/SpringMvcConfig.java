package com.yangzhuo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.yangzhuo.controller")
@EnableWebMvc//json数据转换为对象
public class SpringMvcConfig {
}
