package com.myapp.bean_annotation;


import com.myapp.bean_annotation.casefactory.Case;
import com.myapp.bean_annotation.monitorfactory.Monitor;
import com.myapp.bean_annotation.motherboardfactory.Motherboard;

public class PC {

    private final Case theCase;
    private final Monitor monitor;
    private final Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt();
    }
}
