package com.newdemoone.demoone.config;


import com.newdemoone.demoone.aspect.LogAspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
////    @Resource
////    LogAspect logAspect;
////    public void addInterceptors(InterceptorRegistry registry){
////        registry.addInterceptor((HandlerInterceptor) logAspect)
////                .addPathPatterns("/**");//针对那些请求 这种是多有的请求。
//
//    }
}
