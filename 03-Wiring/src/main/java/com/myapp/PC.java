package com.myapp;

import com.myapp.casefactory.Case;
import com.myapp.monitorfactory.Monitor;
import com.myapp.motherboardfactory.Motherboard;
import lombok.Getter;

@Getter
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
