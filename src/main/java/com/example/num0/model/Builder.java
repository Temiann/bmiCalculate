package com.example.num0.model;

import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public interface Builder {
    public void createColorAndText(int w, int h, Color color);
    public void createIndicator(double value);
    public Indicator build();
}
