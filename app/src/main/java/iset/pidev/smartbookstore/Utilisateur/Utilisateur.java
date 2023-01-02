package iset.pidev.smartbookstore.Utilisateur;

import com.google.gson.annotations.SerializedName;

public class Utilisateur {
    @SerializedName("cin")
    private int cin;
    @SerializedName("nom")
    private String nom;
    @SerializedName("prenom")
    private String prenom;
    @SerializedName("login")
    private String login;
    @SerializedName("email")
    private String email;
    @SerializedName("password")
    private String password;
    @SerializedName("adresse")
    private String adresse;
    @SerializedName("telephone")
    private String telephone;

    public Utilisateur(int cin, String nom, String prenom,String login,String email,String password,String adresse,String telephone) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.email = email;
        this.password = password;
        this.adresse = adresse;
        this.telephone = telephone;

    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
/*
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getImageURL() {
        return "http://192.168.100.107/connection/smartphone/"+imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }*/
}
