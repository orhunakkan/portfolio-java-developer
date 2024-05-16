package com.myapp.bean_annotation.config;

import com.myapp.bean_annotation.cpufactory.IntelCPU;
import com.myapp.bean_annotation.motherboardfactory.AsusMotherboard;
import com.myapp.bean_annotation.motherboardfactory.IntelMotherboard;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import com.myapp.bean_annotation.ramfactory.SamsungRAM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {

    @Bean
    public IntelCPU cpu() {
        return new IntelCPU();
    }

    @Bean
    public SamsungRAM ram() {
        return new SamsungRAM();
    }

    @Bean(name = "asus")
    public Motherboard motherboardAsus() {
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44") {
        };
    }

    @Bean(name = "intel")
    public Motherboard motherboardIntel() {
        return new IntelMotherboard("GZ-100", "Intel", 8, 4, "v1.20") {
        };
    }
}
