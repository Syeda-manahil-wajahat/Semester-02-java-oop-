public class Main {

    public static void main(String[] args) {

        // Points
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(4, 6);
        Point p4 = new Point(7, 8);

        // Lines
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        // Triangle
        Triangle t1 = new Triangle(p1, p2, p3);

        // Complex Numbers
        complexNumber c1 = new complexNumber(3, 4);
        complexNumber c2 = new complexNumber(2, 5);
        // Rational Numbers
        rationalNumber r1 = new rationalNumber(3, 4);
        rationalNumber r2 = new rationalNumber(2, 5);

        // Display everything
        p1.display(p3);
        l1.display(l2);
        t1.display();
        c1.display(c2);
        r1.display(r2);
    }
}