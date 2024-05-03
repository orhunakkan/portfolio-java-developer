package com.myapp.bean_annotation;

import com.myapp.bean_annotation.config.PcConfig;
import com.myapp.bean_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);
        Monitor monitor = container.getBean(Monitor.class);
        System.out.println(monitor);

    }
}
