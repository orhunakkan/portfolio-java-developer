package com.myapp.bean_annotation.cpufactory;

import lombok.Data;

@Data
public class IntelCPU implements CPU {

    private int coreCount;
    private double clockSpeed; // in GHz
    private String model;

    @Override
    public void process() {
        System.out.println("Intel CPU processing: " + model + " with " + coreCount + " cores at " + clockSpeed + "GHz.");
    }
}
