package session2.assignment;

public class MyPoint {
    public double x;
    public double y;
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(10, 30.5);

        System.out.println("The first point is: ");
        System.out.println(+point1.getX() + "," + point1.getY());

        System.out.println("The second point is: ");
        System.out.println(+point2.getX() + "," + point2.getY());
        //d=√((x2 – x1)² + (y2 – y1)²)
        double distance=Math.sqrt(Math.pow(point2.getX()-point1.getX(),2)+(Math.pow(point2.getY()-point1.getY(),2)));
        System.out.println("The distance between the points is: "+  distance);
    }
}
