public class Point {
   

    private double x;
    private double y;

    // Default / Null Constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Addition of two points
    public Point add(Point p) {
       double newX=this.x + p.x;
       double newY=this.y + p.y;
        return new Point(newX,newY);
    }

    // Subtraction of two points
    public Point subtract(Point p) {
        double newY=this.y - p.y;
        double newX=this.x - p.x;
        return new Point(newX,newY);
    }

    // Magnitude of point
    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    // Distance between two points
    public double distance(Point p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Display
public void display(Point p) {

    System.out.println("======================================");
    System.out.println("║              POINT                 ║");
    System.out.println("======================================");

    System.out.println("Current Point   : " + this);
    System.out.println("Other Point     : " + p);

    System.out.println("Addition        : " + add(p));
    System.out.println("Subtraction     : " + subtract(p));
    System.out.println("Magnitude       : " + magnitude());
    System.out.println("Distance        : " + distance(p));
}
}




