import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javax.swing.text.html.ImageView;
import java.io.IOException;
import java.net.URL;
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
    private void addStudent() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/ajout.fxml"));
        Parent part = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.setTitle("Ajout Etudiant");
        stage.show();

    }

    @FXML
    private void delete(){
    }


    @FXML
    private void modify(){

    }

    @FXML
    private void back() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/accueil.fxml"));
        Parent part = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.setTitle("GPHY");
        stage.show();
    }

    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

}
