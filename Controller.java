package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;




public class Controller {
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;

public void calculate_BMI() {
    if (tf2.getText().isEmpty() || tf1.getText().isEmpty()) {
        lb1.setText("ERROR");
        lb2.setText("ERROR");
    } else {
        float a = Float.parseFloat(tf1.getText());
        float b = Float.parseFloat(tf2.getText());
        float bmi = b / (a * a);
        lb1.setText("" + bmi);

        if (bmi <= 18.5) {
            lb2.setText("UnderWeight");
        } else if (bmi <= 24.9) {
            lb2.setText("NormalWeight");
        } else if (bmi <= 29.9) {
            lb2.setText("OverWeight");
        } else {
            lb2.setText("Obese");

        }
    }
}}
