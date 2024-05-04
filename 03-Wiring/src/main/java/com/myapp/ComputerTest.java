package com.myapp;

import com.myapp.casefactory.Case;
import com.myapp.config.PcConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);
        Case theCase = container.getBean(Case.class);
        System.out.println("theCase.getDimensions().getDepth() = " + theCase.getDimensions().getDepth());

    }
}
