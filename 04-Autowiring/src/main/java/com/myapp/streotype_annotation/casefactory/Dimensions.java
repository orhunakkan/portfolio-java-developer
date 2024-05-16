package com.myapp.streotype_annotation.casefactory;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dimensions {

    private int width;
    private int height;
    private int depth;

    public Dimensions() {
        this.width = 10;
        this.depth = 20;
        this.height = 30;
    }
}
