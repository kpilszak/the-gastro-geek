package com.kpilszak.thegastrogeekbackend.infrastructure.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

public class ApiPrefixInterceptor implements HandlerInterceptor {
    private final String apiPrefix;

    public ApiPrefixInterceptor(String apiPrefix) {
        this.apiPrefix = apiPrefix;
    }
}
