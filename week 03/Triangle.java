public class Triangle {


    private Point p1;
    private Point p2;
    private Point p3;
    private static int objCount=0;
    // Default Constructor
    public Triangle() {
        p1 = new Point();
        p2 = new Point();
        p3 = new Point();
        objCount++;
    }

    // Parameterized Constructor
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);
        objCount++;
    }
    //copy constructor
    public Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
        objCount++;
   }
    // Getters
    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    // Setters
    public void setP1(Point p1) {
        this.p1 = new Point(p1);
    }

    public void setP2(Point p2) {
        this.p2 = new Point(p2);
    }

    public void setP3(Point p3) {
        this.p3 = new Point(p3);
    }

    // Find side lengths
    public double side1() {
        return p1.distance(p2);
    }

    public double side2() {
        return p2.distance(p3);
    }

    public double side3() {
        return p3.distance(p1);
    }

    // Check Equilateral Triangle
    public boolean isEquilateral() {

        double a = side1();
        double b = side2();
        double c = side3();

        return a == b && b == c;
    }

    // Check Isosceles Triangle
    public boolean isIsosceles() {

        double a = side1();
        double b = side2();
        double c = side3();

        return a == b || b == c || a == c;
    }
    public static int getObjCount(){
        return objCount;
    }
    public String toString() {
        return "Triangle: " + p1 + ", " + p2 + ", " + p3;
    }
    // Display Triangle
    public void display() {

    System.out.println("======================================");
    System.out.println("║             TRIANGLE               ║");
    System.out.println("======================================");

    System.out.println("Triangle        : " + this);

    System.out.println("Side 1          : " + side1());
    System.out.println("Side 2          : " + side2());
    System.out.println("Side 3          : " + side3());

    if (isEquilateral()) {
        System.out.println("Type            : Equilateral");
    }
    else if (isIsosceles()) {
        System.out.println("Type            : Isosceles");
    }
    else {
        System.out.println("Type            : Scalene");
    }
    System.out.println("Object Count        :"+objCount);
}
}   

