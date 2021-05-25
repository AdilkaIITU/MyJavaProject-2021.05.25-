package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.BreakIterator;


public class Controller1 {
    @FXML
    private Label label;
    private long number1;
    private String operator = "";
    private boolean start=true;




    @FXML
    private void processNumPad(ActionEvent event){
        if (start) {
        label.setText("");
        start=false; }
        String value = ((Button)event.getSource()).getText();
        label.setText(label.getText()+value);
    }
    @FXML
    private void processOperator(ActionEvent event){
        if(label.getText().equals("ERROR")){return;}
        String value = ((Button)event.getSource()).getText();
        if(!value.equals("=")){
            if(!operator.isEmpty()){return;}
            operator=value;
            number1=Long.parseLong(label.getText());
            label.setText("");
        }else{
            if(operator.isEmpty()){return;}
            if(label.getText().isEmpty()){
                label.setText("ERROR");
                operator = "";
                start=true;
                return;
            }
            label.setText(calculate(number1,Long.parseLong(label.getText()),operator));
            operator = "";
            start=true;
        }
    }


    @FXML
    private void clearOutput(ActionEvent event){
        label.setText("0");
        start = true;
        operator="";
    }




    private String calculate(long number1, long number2, String op) {
        switch (op) {
            case "+":
                return String.valueOf(number1 + number2);
            case "-":
                return String.valueOf(number1 - number2);
            case "x":
                return String.valueOf(number1 * number2);
            case "÷":
                if (number2 == 0) {
                    return "ERROR";
                }
                return String.valueOf(number1 / number2);
        }
         return "ERROR";
    }
}
