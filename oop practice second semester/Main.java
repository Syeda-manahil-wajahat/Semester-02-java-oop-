public class Main {
    public static void main(String[] args) {
Calculator num1= new Calculator(16,4);
    //Point and line main 
Poi p1=new Poi(0,3);
Poi p2=new Poi(3,4);
Poi p3=new Poi(4,5);
Poi p4=new Poi(6,7);
Line l1=new Line(p1,p2);
Line l2=new Line(p3,p4);
    // date and employee
    Date d1= new Date();
    Date today=new Date(15,8,2026);
    Employee emp=new Employee(135,"manahil",30000,d1);
    
//displays
p1.display(p2);
num1.display();
l1.display(l2);
System.out.println(d1);
emp.applyForLeave(12);
emp.display(today);       
}
    
}
