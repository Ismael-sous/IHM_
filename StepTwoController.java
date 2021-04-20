

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
import javafx.fxml.Initializable;

/**
 * Write a description of JavaFX class StepTwoController here.
 *
 * @author Patrick GIRARD
 * @version 22/03/2020
 */
public class StepTwoController
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
}
