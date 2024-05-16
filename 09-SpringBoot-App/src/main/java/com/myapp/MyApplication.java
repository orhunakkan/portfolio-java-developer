package com.myapp;

import com.myapp.config.AppConfigData;
import com.myapp.config.DBConfigData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        ApplicationContext container =  SpringApplication.run(MyApplication.class, args);
        String str = container.getBean(String.class);

        AppConfigData appConfigData = container.getBean(AppConfigData.class);
        System.out.println(appConfigData.getUsername());
        System.out.println(appConfigData.getPassword());
        System.out.println(appConfigData.getUrl());

        DBConfigData data = container.getBean(DBConfigData.class);
        System.out.println(data.getPassword());
        System.out.println(data.getUsername());
        System.out.println(data.getType());

    }

    @Bean
    public String str1() {
        return "ORHUN";
    }

}
