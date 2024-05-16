package com.myapp.bean_annotation;

import com.myapp.bean_annotation.config.TaskConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(TaskConfig.class);

        String theString = container.getBean(String.class);
        Integer theInt = container.getBean(Integer.class);

        System.out.println(theString + " " + theInt);

    }

}
