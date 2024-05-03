package com.myapp.bean_annotation;

import com.myapp.bean_annotation.config.ComputerConfig;
import com.myapp.bean_annotation.cpufactory.IntelCPU;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import com.myapp.bean_annotation.ramfactory.SamsungRAM;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class);

        IntelCPU cpu = container.getBean(IntelCPU.class);
        Motherboard motherboard = container.getBean(Motherboard.class);
        SamsungRAM ram = container.getBean(SamsungRAM.class);

        Computer myComputer = new Computer(cpu, motherboard, ram);
        myComputer.operate();

        System.out.println("******************** Multiple Beans Solution ********************");



    }
}
