package iset.pidev.smartbookstore.livre;

import com.google.gson.annotations.SerializedName;

public class Livre {

    @SerializedName("id")
    private int id;
    @SerializedName("nom")
    private String nom;
    @SerializedName("rebrique")
    private String rebrique;
    @SerializedName("image")
    private String imageURL;


    public Livre(int numSerie, String nom, String rebrique) {
        this.id = numSerie;
        this.nom = nom;
        this.rebrique = rebrique;
        this.imageURL = imageURL;
    }

    public int getNumSerie() {
        return id;
    }

    public void setNumSerie(int numSerie) {
        this.id = numSerie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRebrique() {
        return rebrique;
    }

    public void setRebrique(String rebrique) {
        this.rebrique = rebrique;
    }

    public String getImageURL() {
        return "http://192.168.81.222/smartbook/livre/"+imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
