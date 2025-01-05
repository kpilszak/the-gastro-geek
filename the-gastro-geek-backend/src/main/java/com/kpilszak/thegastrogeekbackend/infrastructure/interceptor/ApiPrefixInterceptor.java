package com.kpilszak.thegastrogeekbackend.infrastructure.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class ApiPrefixInterceptor implements HandlerInterceptor {
    private final String apiPrefix;

    public ApiPrefixInterceptor(String apiPrefix) {
        this.apiPrefix = apiPrefix;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
