package com.myapp.bean_annotation;

import com.myapp.bean_annotation.cpufactory.CPU;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;
import com.myapp.bean_annotation.ramfactory.RAM;

public class Computer {

    private final CPU cpu;
    private final Motherboard motherboard;
    private final RAM ram;

    // Constructor with dependency injection
    public Computer(CPU cpu, Motherboard motherboard, RAM ram) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.ram = ram;
    }

    public void operate() {
        cpu.process();
        motherboard.loadProgram("IntelliJ IDEA");
        ram.store();
    }

}
