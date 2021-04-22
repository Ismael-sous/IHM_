import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import sun.rmi.registry.RegistryImpl;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;



/**
 *
 * @author 2.1
 * @version 22/03/2020
 */
public class Controller implements Initializable
{
    private Main mainApp;
    @FXML private TableView myTable;

    @FXML
    private Button listButton;
    @FXML
    private ImageView backBtn;

    public void list() throws IOException
    {
//        Parent part = FXMLLoader.load(getClass().getResource("listeEtu.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/listeEtu.fxml"));
        Parent part = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.setTitle("Liste Etudiant");
        stage.show();
        TableColumn prenom = new TableColumn("Prénom");
        TableColumn<Etudiant, String> nom = new TableColumn<Etudiant, String>("Nom");
        TableColumn<Etudiant, String> annee = new TableColumn<>("Année");
        TableColumn<Etudiant, String> promo = new TableColumn<Etudiant, String>("Promotion");
        TableColumn<Etudiant, String> option = new TableColumn<>("Option");
        TableColumn<Etudiant, String> select = new TableColumn<>("Sélectionner");
        TableView myTable = (TableView) loader.getNamespace().get("myTable");
        Button modifyButton = (Button) loader.getNamespace().get("modifyButton");
        Button deleteButton = (Button) loader.getNamespace().get("deleteButton");

        modifyButton.setDisable(true);
        deleteButton.setDisable(true);

        myTable.getColumns().addAll(prenom, nom, annee, promo,option,select);

        final ObservableList<Etudiant> data = FXCollections.observableArrayList(
                new Etudiant("Jacob","Smith",1999,"M1","Biotech"),
                new Etudiant("Emma","Jones",1998,"M2","Imagerie")
        );
        prenom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("prenom"));
        nom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("nom"));
        annee.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("annee"));
        promo.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("promo"));
        option.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("option"));
        select.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("select"));

        myTable.setItems(data);

    }

    @FXML
    private void addStudent(MouseEvent event) {
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getClassLoader().getResource("FXML/ajout.fxml"));
                Stage stage = new Stage();
                stage.setTitle("My New Stage Title");
                stage.setScene(new Scene(root));
                stage.show();
                // Hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


    @FXML
    private void delete(){
    }


    @FXML
    private void modify(){

    }

    public void back(MouseEvent event) {
        Parent root;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("FXML/accueil.fxml")));
            Stage stage = new Stage();
            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

}
