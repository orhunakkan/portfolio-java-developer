package com.myapp.bean_annotation.config;

import com.myapp.bean_annotation.casefactory.Case;
import com.myapp.bean_annotation.casefactory.DellCase;
import com.myapp.bean_annotation.monitorfactory.AcerMonitor;
import com.myapp.bean_annotation.monitorfactory.Monitor;
import com.myapp.bean_annotation.monitorfactory.SonyMonitor;
import com.myapp.bean_annotation.motherboardfactory.AsusMotherboard;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name = "sony")
    public Monitor sonyMonitor() {
        return new SonyMonitor("S25 Inch", "Sony", 25);
    }

    @Primary
    @Bean(name = "acer")
    public Monitor acerMonitor() {
        return new AcerMonitor("A23 Inch", "Acer", 23);
    }

    @Bean
    public Case dellCase() {
        return new DellCase("220B", "Dell", "240");
    }

    @Bean
    public Motherboard motherboardAsus() {
        return new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");
    }
}
