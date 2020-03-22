package com.classsystem.classsystem.config;

import com.classsystem.classsystem.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 拦截器配置类
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    public TokenInterceptor tokenInterceptor;

    //    @Resource
//    public SessionInterceptor sessionInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] exclude = {"/", "/druid/*", "/loginWx", "/error", "/test", "/app/**", "/temp-rainy/**", "/recommend/**"};

        registry.addInterceptor(tokenInterceptor)                   //添加拦截器
                .excludePathPatterns(exclude)//对应的不拦截的请求
                .addPathPatterns("/**");


//        String[] tokenPath = {"/app/**", "/gs-guide-websocket/**", "/user/**"};
//        registry.addInterceptor(sessionInterceptor)
//                .addPathPatterns(tokenPath);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/temp-rainy/**").addResourceLocations("file:D:/temp-rainy/");
    }
}

