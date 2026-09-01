public class Line {
    private Poi p1;
    private Poi p2;
    private static int objcount;

    public Line() {
        this.p1 = new Poi();
        this.p2 = new Poi();
        this.objcount++;
    }
    public Line(Poi p1,Poi p2) {
        this.p1 = new Poi(p1);
        this.p2 = new Poi(p2);
        this.objcount++;
    }
    public Line(Line obj) {
        this.p1 = new Poi(obj.p1);
        this.p2 = new Poi(obj.p2);
        this.objcount++;
    }
    public Poi getP1(){
    return p1;
    }
    public Poi getP2(){
    return p2;
    }
    public double length(){
        return getP1().dist(getP2());
    }
    public Poi midPoint(){
        double x=(p1.getX()+p2.getX())/2.0;
        double y=(p1.getY()+p2.getY())/2.0;
        return new Poi(x,y);
    }
    public double slope() {
    return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
}
    public Poi intersection(Line l){
        double c1=p1.getY()-this.slope()*p1.getX();
        double c2=l.getP1().getY()-l.slope()*l.getP1().getX();
       double x=(c2-c1)/(this.slope()-l.slope()) ;
       double y=this.slope()*x+c1;
       return new Poi(x,y);
    }
    public String pointSlope(){
        return "(Y-"+p1.getY()+")="+slope()+"(x-"+p1.getX()+")";
    }
public void display(Line l){
System.out.println("---------LINE----------");
System.out.println("LENGTH:"+length());
System.out.println("MIDPOINT:"+this.midPoint());
System.out.println("INTERSECTION:"+this.intersection(l));
System.out.println("SLOPE:"+slope());
System.out.println("POINT SLOPE FORM:"+pointSlope());
System.out.println("------------------------");
}

}
