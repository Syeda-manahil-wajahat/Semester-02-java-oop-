public class Line {
    private Point p1;
    private Point p2;
    private static int objCount=0;
    
// null constructor
public Line(){
    this.p1=new Point();
    this.p2=new Point();
    objCount++;
}
// parameterized constructor
public Line(Point p1,Point p2){
    this.p1=new Point(p1);
    this.p2=new Point(p2);
    objCount++;
}
// copy constructor
public Line(Line obj){
    this.p1=new Point(obj.p1);
    this.p2=new Point(obj.p2);
    objCount++;
}
//getters
public Point getP1(){
    return p1;
}
public Point getP2(){
    return p2;
}
//slope
public double slope(){
    return ((getP2().getY()-getP1().getY())/(getP2().getX()-getP1().getX()));
}
//length of line
public double length() {
    return getP1().distance(getP2());
}
//midpoint
public String midpoint() {
    return "(" + (getP2().getX() + getP1().getX()) / 2
           + ", " + (getP2().getY() + getP1().getY()) / 2 + ")";
}
//point slope form
public String pointSlope(){
    return "(y-"+getP1().getY()+")="+slope()+"(x-"+getP1().getX()+")";
}
//intersection point
public Point intersection(Line l){
    double m1 = this.slope();
    double m2 = l.slope();
    double x = (l.getP1().getY() - getP1().getY()
             + m1 * getP1().getX()
             - m2 * l.getP1().getX())
             / (m1 - m2);

    double y = getP1().getY()
             + m1 * (x - getP1().getX());
    return new Point(x, y);
}
// objCount
public int getObjCount(){
    return objCount;
}
// toString
public String toString(){
    return "Line:"+p1+"to"+p2;
}
// display
public void display(Line l) {

    System.out.println("===============================");
    System.out.println("║               LINE          ║");
    System.out.println("===============================");

    System.out.println("Line            : " + this);
    System.out.println("Other Line      : " + l);

    System.out.println("Slope           : " + slope());
    System.out.println("Length          : " + length());
    System.out.println("Midpoint        : " + midpoint());
    System.out.println("Point-Slope     : " + pointSlope());
    System.out.println("Intersection    : " + intersection(l));
}
}
