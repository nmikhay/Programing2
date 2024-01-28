package session1;


//constructor(s) --> they can be optional sometimes
public class Circle { //all classes must have purple staff
    //Data fields
    double radius = 1;

    //Constructor(s) -> which can be optional sometime ????
    // 1- the same name of the class
    // 2- It has no return type or void
    public Circle(){ //default constructor

    }

    //constructor with parameter
    public Circle(double newRadius){
        radius = newRadius;
    }

    //method
    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }
}
