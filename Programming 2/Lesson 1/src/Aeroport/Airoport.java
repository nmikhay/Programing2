package Aeroport;

import java.util.Date;

import static java.lang.String.format;

public class Airoport {
    String code;
    String city;
    double latitude;
    double longitude;
    int openingDate;

    public Airoport(String code, String city, double latitude, double longitude, int openingDate) {
        this.code = code;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.openingDate = openingDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) throws IllegalArgumentException {
        if(code.length()<3){
            throw new IllegalArgumentException("The airport code could not be less that 3 characters long ");
        }
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) throws IllegalArgumentException{
        if(city.contains("[0-9]")){
            throw new IllegalArgumentException("The name of a city cannot contain any digits ");
        }
        this.city = city;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude)throws IllegalArgumentException {
        if(latitude < - 90 && latitude > 90){
            throw new IllegalArgumentException("The latitude must be between -90 and 90 ");
        }
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) throws IllegalArgumentException{
        if (longitude<-180 && longitude>180){
            throw new IllegalArgumentException("The lkongtitude must be between -180 - 180 ");
        }
        this.longitude = longitude;
    }

    public int getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(int openingDate) throws IllegalArgumentException{
        if (openingDate < 1800 && openingDate > 2100){
            throw new IllegalArgumentException("The opening date must be between 1800-2100 ");
        }
        this.openingDate = openingDate;
    }

    @Override
    public String toString() {
        return "ParameterInvalidException{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", openingDate=" + openingDate +
                '}';
    }
    public String toDataString(){
        return String.format("%s;%s,%.2f,%.2f,%d", this.code,this.city,this.latitude,this.longitude,this.openingDate);
    }
}

