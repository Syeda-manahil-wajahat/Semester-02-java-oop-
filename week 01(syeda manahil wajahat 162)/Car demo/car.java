public class car {
//attributes
    private int carId;
    private String brand;
    private int fuelPercentage;
    private int speed;
    private float angle;
    private boolean engineOn;
   
//default/null constructor
public car(){
    this.carId=1004;
    this.angle=180;
    this.brand="supra";
    this.fuelPercentage=90;
    this.speed=50;
    this.engineOn=true;
    
}
//parameterized constructor
public car(int newSpeed,float newAngle,int newCarId,String newBrand,int newFuelPercentage){
    this.speed=newSpeed;
    this.angle=newAngle;
    this.carId=newCarId;
    this.brand=newBrand;
    this.fuelPercentage=newFuelPercentage;
    this.engineOn=false;
    
}
//functions
public void startEngine(){
    if(fuelPercentage>0)
    {this.engineOn=true;
        System.out.println(this.brand+": engine is on");
    }else{System.out.println(this.brand+": fuel is insufficient,can not start the engine");}
}
public void accelerate(){
    if(engineOn && fuelPercentage>5){
        this.speed+=10;
        this.fuelPercentage-=5;
        System.out.println(this.brand+"  is accelerating");
    }
    else{
        System.out.println("can not accelerate car");
    }
}
public void moveRight(){
    this.angle+=90;
    System.out.println("the car is turning right with an angle "+this.angle);

}
public void moveLeft(){
    this.angle-=90;
    System.out.println("the car is turning left with an angle "+this.angle);
}
public void turboMode(){
    if(engineOn && fuelPercentage>5){
        this.speed+=63;
        this.fuelPercentage-=12;
        System.out.println(this.brand+" is in turbo mode with speed "+speed+" km/h and "+fuelPercentage+"% fuel");
    }
    else{
        System.out.println("turbo mode can't be activated");
    }
}
public void stopEngine(){
    this.engineOn=false;
    this.speed=0;
    System.out.println("Engine is off and the speed is reset to 0");
}
public void display(){
System.out.println("!!--------------!!");
System.out.println("car id is:"+this.carId);
System.out.println("car is moving with an angle:"+this.angle);
System.out.println("the fuel percentage is:"+this.fuelPercentage);
System.out.println("car brand name is:"+this.brand);
System.out.println("speed:"+this.speed);
}
}