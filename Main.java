import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * @author 2.1
 * @version 22/03/2020
 */
public class Main extends Application
{

    @FXML
    private static Stage window;
    public static Scene scene1, scene2;

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Parent root = FXMLLoader.load(getClass().getResource("accueil.fxml"));
        scene1 = new Scene(root);

        Parent root2 = FXMLLoader.load(getClass().getResource("listeEtu.fxml"));
        scene2 = new Scene(root2);


        Scene scene = new Scene(root);


        stage.setScene(scene);
        // Show the Stage (window)
        stage.show();

    }

        public static Stage getWindow(){
            return window;
        }

        public static void main(String[] args) {
            launch(args);
        }



    }


