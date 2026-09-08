package arrays.employee;

public class Main {
    public static void main(String[] args) {
    Date d1=new Date(26,8 ,2000 );
    Date d2=new Date(2,4 ,2025 );
    Date d3=new Date(19,6 ,2001 );
    Date d4=new Date(30, 7, 1999);
    //employee 
    Employee e1=new Employee(123, "wania", d1, 50000);
    Employee e2=new Employee(345, "farheen", d2, 25000);
    Employee e3=new Employee(678, "sawera", d3, 60000);
    Employee e4=(Employee) e3.clone();
   // e4.setName("umar");
    Employee[] employees=new Employee[]{e1,e2,e3,e4};
    for(Employee e:employees){
        System.out.println(e);
    }
    System.out.println("e4.equals(e3)"+e3.equals(e4));
    System.out.println("total employess in company :"+Employee.getObjcount());
}}
