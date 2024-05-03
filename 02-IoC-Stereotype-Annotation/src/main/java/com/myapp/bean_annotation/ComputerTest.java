package com.myapp.bean_annotation;

import com.myapp.bean_annotation.casefactory.Case;
import com.myapp.bean_annotation.config.ComputerConfig;
import com.myapp.bean_annotation.config.TaskConfig;
import com.myapp.bean_annotation.monitorfactory.Monitor;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, TaskConfig.class);

        System.out.println("********************Multiple Beans******************");
        //Monitor theMonitor = container.getBean("sonyMonitor", Monitor.class); //DEFAULT BEAN NAME
        //Monitor theMonitor2 = container.getBean("acer", Monitor.class); //CUSTOM BEAN NAME
        Monitor theMonitor2 = container.getBean(Monitor.class); //Primary Annotation


        //Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor2, theMotherboard);

        myPc.powerUp();

        String myString = container.getBean(String.class);
        System.out.println("myString = " + myString);

        Integer myInteger = container.getBean(Integer.class);
        System.out.println("myInteger = " + myInteger);


    }
}
