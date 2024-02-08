package com.fabiofrau.Live7Feb.config;

import com.fabiofrau.Live7Feb.interceptors.EmailValidationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Autowired
    private EmailValidationInterceptor emailValidationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(emailValidationInterceptor).addPathPatterns("/v1/user/signup");
    }
}
