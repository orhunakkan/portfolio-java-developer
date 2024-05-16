package com.myapp.bean_annotation.monitorfactory;

public abstract class Monitor {

    private final String model;
    private final String manufacturer;
    private final int size;

    public Monitor(String model, String manufacturer, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public abstract void drawPixelAt();
}
