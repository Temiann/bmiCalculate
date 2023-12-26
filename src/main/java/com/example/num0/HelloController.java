package com.example.num0;

import com.example.num0.model.Director;
import com.example.num0.model.Indicator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class HelloController {
    public TextField txt1,txt2,txt3;
    public AnchorPane ancorPane1;
    public Button onClick;
    public Label labelStatus;
    public AnchorPane ancor;
    public HBox hboxIndicator;
    Director director = new Director();
    Indicator indicator;
    @FXML
    public void calculateBMI(){
        double height = Double.parseDouble(txt1.getText());
        double weight = Double.parseDouble(txt2.getText());
        double result = weight/height/height*10000;
        String format = String.format("%.2f",result);

        txt3.setText(format);
        if(result<18.5){
            indicator = director.Constr((int)ancor.getWidth(),(int)ancor.getHeight(), Color.DARKGREY,result);
            labelStatus.setText("Недостаток веса");
            indicator.show(ancor);
        } else if(result>18.5 && result<25){
            indicator = director.Constr((int)ancor.getWidth(),(int)ancor.getHeight(), Color.DARKGREY, result);
            labelStatus.setText("Нормальный вес");
            indicator.show(ancor);
        } else if(result>25){
            indicator = director.Constr((int)ancor.getWidth(),(int)ancor.getHeight(), Color.DARKGREY, result);
            labelStatus.setText("Избыток веса");
            indicator.show(ancor);
        }
    }
    public void onClick(){
        try {
            calculateBMI();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}