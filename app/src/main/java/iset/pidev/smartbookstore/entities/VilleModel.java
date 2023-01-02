package iset.pidev.smartbookstore.entities;

import com.google.android.gms.maps.model.LatLng;
import java.io.Serializable;
import java.util.List;

public class VilleModel implements Serializable {
    private String nom;
    private int dataDesc;
    private int dataImage;
    private List<Integer> location;
    private LatLng lg;

    public LatLng getLg() {
        return lg;
    }

    public void setLg(LatLng lg) {
        this.lg = lg;
    }

    public VilleModel(String nom, int dataDesc, int dataImage, List<Integer> location) {
        this.nom = nom;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
        this.location = location;
    }

    public VilleModel(String nom, int dataDesc, int dataImage) {
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

    public List<Integer> getLocation() {
        return location;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }
}
