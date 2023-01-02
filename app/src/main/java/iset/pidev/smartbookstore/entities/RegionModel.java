package iset.pidev.smartbookstore.entities;

import java.util.List;

public class RegionModel {

    private String nom;
    private int dataDesc;
    private int dataImage;
    private List<VilleModel> location;

    public RegionModel(String nom, int dataDesc, int dataImage, List<VilleModel> location) {
        this.nom = nom;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
        this.location = location;
    }

    public RegionModel(String nom, int dataDesc, int dataImage) {
        this.nom = nom;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(int dataDesc) {
        this.dataDesc = dataDesc;
    }

    public int getDataImage() {
        return dataImage;
    }

    public void setDataImage(int dataImage) {
        this.dataImage = dataImage;
    }

    public List<VilleModel> getLocation() {
        return location;
    }

    public void setLocation(List<VilleModel> location) {
        this.location = location;
    }
}
