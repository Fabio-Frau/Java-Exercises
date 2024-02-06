package com.fabiofrau.Interceptors.configurations;

import com.fabiofrau.Interceptors.Interceptors.APILoggingInterceptors;
import com.fabiofrau.Interceptors.Interceptors.LoggedUserInterceptor;
import com.fabiofrau.Interceptors.Interceptors.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfiguration implements WebMvcConfigurer {

    private APILoggingInterceptors apiLoggingInterceptors;
    private TestInterceptor testInterceptor;

    private LoggedUserInterceptor loggedUserInterceptor;

    public SpringMvcConfiguration(APILoggingInterceptors apiLoggingInterceptors, TestInterceptor testInterceptor,
                                  LoggedUserInterceptor loggedUserInterceptor) {
        this.apiLoggingInterceptors = apiLoggingInterceptors;
        this.testInterceptor = testInterceptor;
        this.loggedUserInterceptor = loggedUserInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptors);
        registry.addInterceptor(testInterceptor);
        registry.addInterceptor(loggedUserInterceptor);
    }
}
