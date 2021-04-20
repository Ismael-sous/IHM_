
/**
 * Write a description of class FirstAttempt here.
 *
 * @author Patrick GIRARD
 * @version 22/03/2020
 */
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.geometry.Pos;

public class MainV2 extends Application {
    
    // On nomme le label pour pouvoir le modifier
    private Label myLabel;
    
    // Point d'entrée du programme
    public static void main(String[] args) {
        launch(); // Appel du point d'entrée de l'application JavaFx (voir ci-dessous)
    }
    
    // Point d'entrée de l'application JavaFX
    @Override
    public void start(Stage primaryStage) {

        // Définition du titre de la fenêtre de l'application
        primaryStage.setTitle("JavaFX Example");
        
        // Appel d'une méthode permettant une fermeture propre de l'application
        primaryStage.setOnCloseRequest(e -> Platform.exit());
        
        // On crèe le label
        myLabel = new Label("Hello World !");
        myLabel.setAlignment(Pos.CENTER);
        // Création de la scène (avec des dimensions correspondant à une résolution HD), composé uniquement d'une étiquette affichant du texte
        primaryStage.setScene(new Scene(myLabel, 180, 120));
        
        // Affichage de la fenêtre
        primaryStage.show();
    }
}
