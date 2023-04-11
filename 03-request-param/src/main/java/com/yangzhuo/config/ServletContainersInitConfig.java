package com.yangzhuo.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

//4 定义一个servlet容器启动的配置类，在里面加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springMvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }
    //设置哪些请求归属springMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    //加载spring容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

    //乱码处理

    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}
