public class Calculator {
    private double num1;
    private double num2;
    private static int objcount;
//cons def
public Calculator(){
  this.num1=0;
  this.num2=0;
  this.objcount++;
} 
public Calculator(double num1,double num2){
  this.num1=num1;
  this.num2=num2;
  this.objcount++;
} 
public Calculator(Calculator obj){
  this.num1=obj.num1;
  this.num2=obj.num2;
  this.objcount++;
} 
public double add(){
    return this.num1+this.num2;
}
public double subtract(){
    return this.num1-this.num2;
}
public double mul(){
    return this.num1*this.num2;
}
public double divide(){
    if(num2==0){
        System.out.println("cant divide by zero:");
        return 0;
    }
    return this.num1/this.num2;
}
public double average(){
 return (this.num1+this.num2)/2.0;
}
public double modulus(){
    if(num2==0){
        System.out.println("cant find mod with zero:");
        return 0;
    }
    return num1%num2;
}
public double sqrt(){
    if(num1<0){
        System.out.println("cant find square root of a negative number:");
   return 0; }
   return Math.sqrt(num1);
}
public double power(){
    return Math.pow(num1,num2);
}
public int getObjcount(){
    return objcount;}
public void display(){
System.out.println("---------calc----------");
System.out.println("ADDITION:"+add());
System.out.println("SUBTRACTION:"+subtract());
System.out.println("MULTIPLICATION:"+mul());
System.out.println("DIVISION:"+divide());
System.out.println("MODULUS:"+modulus());
System.out.println("AVERAGE:"+average());
System.out.println("SQUARE ROOT:"+sqrt());
System.out.println("POWER:"+power());
System.out.println("------------------------");
}

}
