package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;




public class Controller3 {
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private Label lb1;
    @FXML
    private Label lb2;

    public void calculate_YourGrade() {
        if(tf2.getText().isEmpty() || tf1.getText().isEmpty()) {
            lb1.setText("ERROR");
            lb2.setText("ERROR");
        }

        else {
            float m = Float.parseFloat(tf1.getText());
            float e = Float.parseFloat(tf2.getText());
            double rk1rk2 = ((m + e) / 2);
            if (rk1rk2 < 50) { lb1.setText("Retake");lb2.setText("Retake");return;}
            float f = Float.parseFloat(tf3.getText());
            double fgrade = ((m + e) / 2) * 0.6 + f * 0.4;
            lb1.setText("" + fgrade);

                if (fgrade < 25) {
                    lb2.setText("0 (F)");
                } else if (fgrade < 50) {
                    lb2.setText("0.5 (FX)");
                } else if (fgrade < 55) {
                    lb2.setText("1.0 (D)");
                } else if (fgrade < 60) {
                    lb2.setText("1.33 (D+)");
                } else if (fgrade < 65) {
                    lb2.setText("1.67 (C-)");
                } else if (fgrade < 70) {
                    lb2.setText("2.0 (C)");
                } else if (fgrade < 75) {
                    lb2.setText("2.33 (C+)");
                } else if (fgrade < 80) {
                    lb2.setText("2.67 (B-)");
                } else if (fgrade < 85) {
                    lb2.setText("3.0 (B)");
                } else if (fgrade < 90) {
                    lb2.setText("3.33 (B+)");
                } else if (fgrade < 95) {
                    lb2.setText("3.67 (A-)");
                } else {
                    lb2.setText("4.0 (A)");
                }
            }
        }}
