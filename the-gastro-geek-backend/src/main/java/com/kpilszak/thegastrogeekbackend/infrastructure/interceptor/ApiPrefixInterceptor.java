package com.kpilszak.thegastrogeekbackend.infrastructure.interceptor;

public class ApiPrefixInterceptor {
    private final String apiPrefix;

    public ApiPrefixInterceptor(String apiPrefix) {
        this.apiPrefix = apiPrefix;
    }
}
