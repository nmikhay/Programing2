package assgnmt5Car;

import java.util.Scanner;

public class Car {
    private String makeModel;
    private int yearOfProd;
    private double engSizeL;
    Scanner scanner = new Scanner(System.in);

    public Car(String makeModel, int yearOfProd, double engSizeL) throws IllegalArgumentException{
        setMakeModel(makeModel);
        setYearOfProd(yearOfProd);
        setEngSizeL(engSizeL);
    }

    //getters and setters

    //year of production 1900 and 2100 other wise throw an error
    //The year of production must be between 1900 and 2100 "
    // "The make model cannot be less than 2 characters long."
    //"The engine size must be between 0 - 10 L.");
    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) throws IllegalArgumentException {
        if(makeModel.length() < 2){
            throw new IllegalArgumentException("The make model cannot be less than 2 characters long");
        }
        this.makeModel = makeModel;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) throws IllegalArgumentException  {
        if(yearOfProd < 1900 || yearOfProd > 2100){
            throw new IllegalArgumentException("The year of production must be between 1900 and 2100");
        }
        this.yearOfProd = yearOfProd;
    }

    public double getEngSizeL() {
        return engSizeL;
    }

    public void setEngSizeL(double engSizeL) throws IllegalArgumentException  {
        if (engSizeL < 0 || engSizeL > 10){
            throw new IllegalArgumentException("The engine size must be between 0 - 10 L.");
        }
        this.engSizeL = engSizeL;
    }


    @Override
    public String toString() {
        return "Car{" +
                "makeModel='" + makeModel + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", engSizeL=" + engSizeL +
                '}';
    }

    //toString
    public String toDataString(){
        return String.format("%s;%d;%.2f", this.makeModel, this.yearOfProd, this.engSizeL);
    }

}
