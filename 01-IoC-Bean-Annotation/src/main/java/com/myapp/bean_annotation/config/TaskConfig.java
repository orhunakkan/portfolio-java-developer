package com.myapp.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public String myString() {
        return "ORHUN";
    }

    @Bean
    public Integer myInt() {
        return 100;
    }

}
