package com.kpilszak.thegastrogeekbackend.config;

import com.kpilszak.thegastrogeekbackend.infrastructure.interceptor.ApiPrefixInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Value("${api.prefix}")
    private String apiPrefix;

    @Value("${api.version}")
    private String apiVersion;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ApiPrefixInterceptor(apiPrefix + "/" + apiVersion))
                .addPathPatterns("/**");
    }
}
