package com.mmall.config;


import com.mmall.controller.common.interceptor.AuthorityInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 占超群
 * @data 2018/12/30 14:35
 */
@SpringBootConfiguration
public class MySpringMVCConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthorityInterceptor()).addPathPatterns("/manage/user/**");
    }
}
