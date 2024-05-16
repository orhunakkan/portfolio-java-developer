package com.myapp.bean_annotation.ramfactory;

import lombok.Data;

@Data
public class SamsungRAM implements RAM {

    private int capacity;
    private double speed;
    private String type;

    @Override
    public void store() {
        System.out.println("Samsung RAM storing data: " + capacity + "GB at " + speed + "MHz, Type: " + type);
    }

}
