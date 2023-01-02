package iset.pidev.smartbookstore.entities;

import com.google.gson.annotations.SerializedName;

public class discover {

    @SerializedName("id")
    private int id;
    @SerializedName("placename")
    private String placename;
    @SerializedName("region")
    private String region;
    @SerializedName("description")
    private String description;
    @SerializedName("image")
    private String imageURL;

    public discover(String placename, String region, String description, String imageURL) {
        this.placename = placename;
        this.region = region;
        this.description = description;
        this.imageURL = imageURL;
    }

    public String getplacename() {
        return placename;
    }

    public void setplacename(String placename) {
        this.placename = placename;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return "http://192.168.81.222/smartbook/livre/"+imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
