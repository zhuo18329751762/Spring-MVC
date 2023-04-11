package com.yangzhuo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3 创建springMvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.yangzhuo.controller")
public class SpringMvcConfig {
}
