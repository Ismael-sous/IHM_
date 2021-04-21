

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;

import java.io.IOException;

/**
 *
 * @author 2.1
 * @version 22/03/2020
 */
public class Controller
{

    private Main mainApp;
    @FXML
    private Button listButton;

    @FXML

    public void list() throws IOException
    {
        Parent part = FXMLLoader.load(getClass().getResource("listeEtu.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void addStudent(){
    }

    @FXML
    private void delete(){
    }

    @FXML
    private void modify(){
    }

}