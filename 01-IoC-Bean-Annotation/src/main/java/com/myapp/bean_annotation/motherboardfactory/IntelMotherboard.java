package com.myapp.bean_annotation.motherboardfactory;

public class IntelMotherboard extends Motherboard {

    public IntelMotherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer, ramSlots, cardSlots, bios);
    }

    public void loadProgram(String programName) {
        System.out.println("Intel Motherboard load program: " + programName);
    }
}
