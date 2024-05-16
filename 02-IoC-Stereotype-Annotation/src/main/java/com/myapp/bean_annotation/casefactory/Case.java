package com.myapp.bean_annotation.casefactory;

public abstract class Case {

    private final String model;
    private final String manufacturer;
    private final String powerSupply;

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public abstract void pressPowerButton();
}
