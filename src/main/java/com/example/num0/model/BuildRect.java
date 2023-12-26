package com.example.num0.model;

import com.example.num0.HelloController;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BuildRect implements Builder {
    Pane pane = new Pane();

    Indicator indicator = new Indicator();

    @Override
    public void createColorAndText(int w, int h, Color color) {
        Rectangle rect = new Rectangle(w,h);
        rect.setFill(color);
        pane.getChildren().add(rect);
    }

    @Override
    public void createIndicator(double resultBMI) {
        Rectangle rectRed = new Rectangle(50,50);
        rectRed.setX(70);
        rectRed.setY(210);
        Rectangle rectGreen = new Rectangle(50,50);
        rectGreen.setX(121);
        rectGreen.setY(210);
        Rectangle rectYellow = new Rectangle(50,50);
        rectYellow.setX(172);
        rectYellow.setY(210);

        rectRed.setFill(Color.GRAY);
        rectGreen.setFill(Color.GRAY);
        rectYellow.setFill(Color.GRAY);

        if(resultBMI<18.5){
            rectRed.setFill(Color.RED);
            rectGreen.setFill(Color.GRAY);
            rectYellow.setFill(Color.GRAY);
        } else if(resultBMI>18.5 && resultBMI<25){
            rectRed.setFill(Color.GRAY);
            rectGreen.setFill(Color.GREEN);
            rectYellow.setFill(Color.GRAY);
        } else if(resultBMI>25){
            rectRed.setFill(Color.GRAY);
            rectGreen.setFill(Color.GRAY);
            rectYellow.setFill(Color.YELLOW);
        }
        pane.getChildren().addAll(rectRed, rectGreen, rectYellow);
    }
    @Override
    public Indicator build(){
        indicator.add(pane);
        return indicator;
    }
}
