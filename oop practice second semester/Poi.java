public class Poi{
   private double x;
   private double y;
   private static int objcount;
public Poi(){
    this.x=0;
    this.y=0;
    this.objcount++;
}
public Poi(double x,double y){
    this.x=x;
    this.y=y;
    this.objcount++;
}
public Poi(Poi obj){
    this.x=obj.x;
    this.y=obj.y;
    this.objcount++;}
public double getX(){
    return x;
}
public double getY(){
    return y;
}
public Poi sub(Poi p){
    double x=p.x-this.x;
    double y=p.y-this.y;
    return new Poi(x,y);
}
public Poi multiply(Poi p){
    double x=p.x*this.x;
    double y=p.y*this.y;
    return new Poi(x,y);
}
public double magnitude(){
    return Math.sqrt((this.x*this.x)+(this.y*this.y));
}
public double dist(Poi p){
    double dx=p.x-this.x;
    double dy=p.y-this.y;
    return Math.sqrt((dx*dx)+(dy*dy));
}
public int getObjcount(){
    return objcount;
}
public String toString(){
    return "("+x+","+y+")";
}
public void display(Poi p){
System.out.println("---------POINT----------");
System.out.println("SUBTRACT:"+sub(p));
System.out.println("MULTIPLY:"+multiply(p));
System.out.println("MAGNITUDE:"+magnitude());
System.out.println("DISTANCE:"+dist(p));
System.out.println("OBJECT COUNT:"+getObjcount());
System.out.println("------------------------");
}

}
