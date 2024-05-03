package com.cydeo.stereotype_annotation;

import com.cydeo.stereotype_annotation.casefactory.Case;
import com.cydeo.stereotype_annotation.config.PcConfig;
import com.cydeo.stereotype_annotation.monitorfactory.Monitor;
import com.cydeo.stereotype_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        Case theCase = container.getBean(Case.class);
        Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor, theMotherboard);
        myPc.powerUp();


    }
}
