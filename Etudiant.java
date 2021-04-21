import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Etudiant {
    private SimpleStringProperty prenom;
    private SimpleStringProperty nom;
    private SimpleIntegerProperty annee;
    private SimpleStringProperty promo;
    private SimpleStringProperty option;

    public Etudiant(String prenom, String nom, int annee, String promo, String option) {
        this.prenom = new SimpleStringProperty(prenom);
        this.nom = new SimpleStringProperty(nom);
        this.annee = new SimpleIntegerProperty(annee);
        this.promo = new SimpleStringProperty(promo);
        this.option = new SimpleStringProperty(option);
    }

    public String getPrenom() {
        return prenom.get();
    }


    public String getNom() {
        return nom.get();
    }


    public int getAnnee() {
        return annee.get();
    }


    public String getPromo() {
        return promo.get();
    }


    public String getOption() {
        return option.get();
    }

}
