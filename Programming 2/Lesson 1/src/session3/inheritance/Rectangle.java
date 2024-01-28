package session3.inheritance;

public class Rectangle extends Shape{
    //private String color; no need to repeat cuz Shape alredy has
    private int width;
    private int height;

    public Rectangle(){

    }

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        setColor(color);
    }

    public void printRectangle(){
        System.out.println(this.height + " " + this.width + " " + getColor());
    }
}
