package com.kpilszak.thegastrogeekbackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.kpilszak.thegastrogeekbackend")
public class DatabaseConfig {
}
