package com.example.num0.model;

import javafx.scene.paint.Color;

public class Director {
    BuildRect buildRect = new BuildRect();
    public Indicator Constr(int w, int h, Color color, double value){
        buildRect.createColorAndText(w,h,color);
        buildRect.createIndicator(value);
        return buildRect.build();
    }
}
