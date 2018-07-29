package ca.uoit.csci4100u.reeng.inc;

/**
 * Created by Bashini on 2018-07-28.
 */

public class Amenities {
    private String amenitiesName;
    private String amenitiesLocation;
    private String amenitiesDescription;

    public Amenities(String amenitiesName,String amenitiesLocation,String amenitiesDescription){
        this.amenitiesName=amenitiesName;
        this.amenitiesLocation= amenitiesLocation;
        this.amenitiesDescription= amenitiesDescription;

    }

    public String getAmenitiesName() {
        return amenitiesName;
    }

    public void setAmenitiesName(String amenitiesName) {
        this.amenitiesName = amenitiesName;
    }

    public String getAmenitiesLocation() {
        return amenitiesLocation;
    }

    public void setAmenitiesLocation(String amenitiesLocation) {
        this.amenitiesLocation = amenitiesLocation;
    }

    public String getAmenitiesDescription() {
        return amenitiesDescription;
    }

    public void setAmenitiesDescription(String amenitiesDescription) {
        this.amenitiesDescription = amenitiesDescription;
    }
}
