

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

/**
 * Write a description of JavaFX class StepTwoController here.
 *
 * @author Patrick GIRARD
 * @version 22/03/2020
 */
public class Controller
{
    // We keep track of the count, and label displaying the count:
    private int count = 0;
    
    @FXML
    private Label myLabel;

    
    /**
     * This will be executed when the button is clicked
     * It increments the count by 1
     */
    @FXML
    private void buttonClick(ActionEvent event)
    {
        // Counts number of button clicks and shows the result on a label
        count = count + 1;
        myLabel.setText(Integer.toString(count));
    }

    @FXML
    private void list(){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Demo.fxml"));
           // Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
        //    stage.initModality(Modality.APPLICATION_MODAL);
         //   stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("ABC");
          //  stage.setScene(new Scene(root1));
            stage.show();

    }

/*    public void pressButton(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/A.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }*/

    @FXML
    private void addStudent(){

    }
}
