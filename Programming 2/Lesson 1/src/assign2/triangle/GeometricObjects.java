package assign2.triangle;

public class GeometricObjects {
    private String color ;
    private boolean filled;
    public GeometricObjects(){
    }
    public GeometricObjects(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString() {

        return "This triangle is this color" + color + " and filled: " + filled;
    }
}
