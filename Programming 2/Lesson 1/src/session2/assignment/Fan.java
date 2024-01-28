package session2.assignment;

public class Fan {
    //three constants with default values
    final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed = SLOW;
    private boolean isFanOn = false;
    private double radius = 5;
    private String color = "blue";

    //this is default constructor
    public Fan() {
        speed = 0;
        isFanOn = false;
        radius = 0.0;
        color = " ";
    }
    //all getters and setters generated for 4 data values
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean isFanOn() {
        return isFanOn;
    }
    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
//method that returns a string description for the fan
    public String toString() {
        String onOrOff;
        if (isFanOn())
            onOrOff = "on";
        else
            onOrOff = "off";
        if (isFanOn) {
            return "This is a " + this.getRadius() + " inch " + this.getColor() + " fan at a speed of " + this.getSpeed();
        } else {
            return "This is a " + this.radius + " inch " + this.getColor() + " fan; fan is " + onOrOff;
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setFanOn(true);//boolean true so the fan is off and second fan will print

        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setFanOn(false);

        System.out.println(fan2);
    }

    }



