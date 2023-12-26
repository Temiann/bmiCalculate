package com.example.num0.model;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Indicator {
    private Pane pane2 = new Pane();
    public void add(Pane pane){
        pane2.getChildren().remove(pane);
        pane2.getChildren().add(pane);
    }
    public void show(AnchorPane pane){
        pane.getChildren().remove(pane2);
        pane.getChildren().add(pane2);
    }
}
