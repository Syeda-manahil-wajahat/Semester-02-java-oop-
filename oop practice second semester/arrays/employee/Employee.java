package arrays.employee;

public class Employee implements Cloneable {
    private static int objcount=0;
    private static final int currentYear=2026;
    private static final double bonusPercentage=0.10;
    private String name;
    private int id;
    private Date joiningDate;
    private double salary;
    public Employee(int id,String name,Date joiningDate,double salary){
        this.id=id;
        this.name=name;
        this.joiningDate=joiningDate;
        this.salary=salary;
        objcount++;

    }
    public boolean iseligibleforpromotion(){
        int years=currentYear-joiningDate.getYear();
        return years>=5;
    }
    public double bonus(){
        return salary*bonusPercentage;
    }
    public double totalSalary(){
        return salary+bonus();
    }
    @Override 
    public String toString(){
        return "---------NAME:"+name+"---------\nID:"+id+"\nDATE OF JOINING:"+joiningDate+"\nTOTAL SALARY:"+totalSalary()+"\nELIGIBLE FOR PROMOTION:"+iseligibleforpromotion();
    }
    @Override 
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Employee)) return false;
        Employee e=(Employee) obj;
        return this.id==e.id && this.name.equals(e.name) && this.joiningDate.equals(e.joiningDate)&& this.salary==e.salary;
    }
    public void setName(String name){
        this.name=name;
    }
    @Override 
    public Object clone(){
        try{
            Employee cloned=(Employee) super.clone();
            cloned.joiningDate=(Date) this.joiningDate.clone();
            return cloned;
        }
        catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
        }
    }
    public static int getObjcount(){
        return objcount;
    }
    


}
