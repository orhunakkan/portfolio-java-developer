package com.myapp.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {
    @Bean
    public String myString() {
        return "Cydeo";
    }

    @Bean
    public Integer myInteger() {
        return 5;
    }
}
