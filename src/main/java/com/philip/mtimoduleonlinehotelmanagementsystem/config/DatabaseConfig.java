package com.philip.mtimoduleonlinehotelmanagementsystem.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("database")
public class DatabaseConfig {
    private String url;
    private String username;
    private String password;

    // getters and setters
}
