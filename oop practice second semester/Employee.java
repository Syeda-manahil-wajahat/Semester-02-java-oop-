
public class Employee {
    private int id;
    private String name;
    private double salary;
    private Date dateOfJoining;
    private String equipments;
    private int totalLeave=20;
    private int leavesTaken=0;
    //constructors
public Employee(){
    this.id=123;
    this.name="ahmad";
    this.salary=130000;
    this.dateOfJoining=new Date();
}
public Employee(int id,String name,int salary,Date dateOfJoining){
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.dateOfJoining=new Date(dateOfJoining);
}
public Employee(Employee obj){
    this.id=obj.id;
    this.name=obj.name;
    this.salary=obj.salary;
    this.dateOfJoining=new Date(obj.dateOfJoining);
}
//Function 01
public int yearsOfService(Date currentDate){
 int years=currentDate.getYear()-dateOfJoining.getYear();
 if(currentDate.getMonth()<dateOfJoining.getMonth()||(currentDate.getMonth()==dateOfJoining.getMonth()&&currentDate.getDay()<dateOfJoining.getDay())){
    years--;
 }
 return years;
}
 
// Function 02
public double Bonus(Date today){
    int years=yearsOfService(today);
    if(years>=5) return salary * 0.15;
    else if (years >= 2) return salary * 0.10;
    else return salary * 0.05;
}
 
// Function 03
public boolean isEligibleForPromotion(Date currentDate) {
        return yearsOfService(currentDate) >= 3;
    }
//Function 04
public void applyForLeave(int day){
    if(leavesTaken+day<=totalLeave){
        System.out.println("LEAVE APPROVED!!!!!!!!");
         leavesTaken+=day;
    }
    else{
        System.out.println("LEAVE NOT APROVED!!!!!! GO BACK TO WORK");
    }
}
public int getLeave(){
    return totalLeave-leavesTaken;
}
//total salary
public double totalSalary(Date currenDate){
    double bonus=Bonus(currenDate);
    return salary+bonus;
}
public String toString(){
return "NAME:"+name+"  ID:"+id;
}
public void display(Date obj){
    System.out.println("---------EMPLOYEE------");
    System.out.println("EMPLOYEE INFO:"+this);
    System.out.println("YEARS OF SERVICE:"+yearsOfService(obj));
    System.out.println("IS EMPLOYEE ELIGIBLE FOR PROMOTION:"+isEligibleForPromotion(obj));
    System.out.println("REMAINING LEAVE:"+getLeave());
    System.out.println("Bonus:"+Bonus(obj));
    System.out.println("SALARY:"+salary);
    System.out.println("TOTAL SALARY:"+totalSalary(obj));
    System.out.println("--------------------");
}
 
}
