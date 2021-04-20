import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.geometry.Insets;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * This class illustrates FXML usage in java.
 * FirstStepFX builds a hello World program
 * 
 * @author Patrick GIRARD
 * @version 22/03/2020
 */

public class StepOneFX extends Application
{

    /**
     * The start method is the main entry point for every JavaFX application. 
     * It is called after the init() method has returned and after 
     * the system is ready for the application to begin running.
     *
     * @param  stage the primary stage for this application.
     */
    
    @Override
    public void start(Stage stage) throws Exception
    {

        // We must find the 
        Parent root = FXMLLoader.load(getClass().getResource("StepOneFX.fxml"));
        Scene scene = new Scene (root);
        stage.setTitle("FXML Example");
        
        stage.setScene(scene);
        // Show the Stage (window)
        stage.show();
    }

}
