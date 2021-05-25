package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;



public class SceneController {
    @FXML
    Button btnScene1;
    @FXML
    Button btnScene2;
    @FXML
    Button btnScene3;
    /*@FXML
    Button btnScene4;
    @FXML
    Button btnScene5;
    @FXML
    Button btnScene6;*/


    public void switchToScene1() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Stage window = (Stage) btnScene1.getScene().getWindow();
        window.setScene(new Scene(root)); }

    /*public void switchToScene4() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnScene4.getScene().getWindow();
        window.setScene(new Scene(root)); }*/




    public void switchToScene2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage window = (Stage) btnScene2.getScene().getWindow();
        window.setScene(new Scene(root));}
    /*public void switchToScene5() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnScene5.getScene().getWindow();
        window.setScene(new Scene(root));}*/




    public void switchToScene3 () throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        Stage window = (Stage) btnScene3.getScene().getWindow();
        window.setScene(new Scene(root)); }
    /*public void switchToScene6 () throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage window = (Stage) btnScene6.getScene().getWindow();
        window.setScene(new Scene(root)); }*/

}
