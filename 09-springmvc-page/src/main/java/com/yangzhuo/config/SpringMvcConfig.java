package com.yangzhuo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.yangzhuo.controller","com.yangzhuo.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
