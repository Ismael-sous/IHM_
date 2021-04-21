

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("listeEtu.fxml"));
        Parent part = loader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.setTitle("Liste Etudiant");
        stage.show();
        TableColumn prenom = new TableColumn("Prénom");
        TableColumn nom = new TableColumn("Nom");
        TableColumn annee = new TableColumn("Année");
        TableColumn promo = new TableColumn("Promotion");
        TableColumn option = new TableColumn("Option");

        TableView myTable = (TableView) loader.getNamespace().get("myTable");
        myTable.getColumns().addAll(prenom, nom, annee, promo,option);

        final ObservableList<Etudiant> data = FXCollections.observableArrayList(
                new Etudiant("Jacob","Smith",1999,"M1","Biotech"),
                new Etudiant("Emma","Jones",1998,"M2","Imagerie")
        );
        prenom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("prenom"));
        nom.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("nom"));
        annee.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("annee"));
        promo.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("promo"));
        option.setCellValueFactory(new PropertyValueFactory<Etudiant,String>("option"));

        myTable.setItems(data);

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


    @FXML
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
