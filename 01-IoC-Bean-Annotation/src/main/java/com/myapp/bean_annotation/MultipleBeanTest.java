package com.myapp.bean_annotation;

import com.myapp.bean_annotation.config.ComputerConfig;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultipleBeanTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);
        Motherboard motherboard = container.getBean("intel", Motherboard.class); // Double beans exist
        motherboard.loadProgram("Multiple Beans");

    }
}
