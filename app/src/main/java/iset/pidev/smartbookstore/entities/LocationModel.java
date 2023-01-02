package iset.pidev.smartbookstore.entities;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class LocationModel {
    private String nom;
    private int dataDesc;
    private int dataImage;
    private LatLng lg;

    public LatLng getLg() {
        return lg;
    }

    public LocationModel(String nom, int dataDesc, int dataImage, LatLng lg) {
        this.nom = nom;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
        this.lg = lg;
    }

    public void setLg(LatLng lg) {
        this.lg = lg;
    }

    public LocationModel(String nom, int dataDesc, int dataImage) {
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

    private List<VilleModel> location;
}
