public class main {

    public static void main(String[] args){
    //object created in heap
        car supra=new car();
    //object creayed in heap 
        car bmw=new car(0,0,4456,"bmw",0);
    //function called using reference variable  
    System.out.println("------Car 01------");
        bmw.startEngine(); 
        bmw.display();
    //function called using reference variable 
    System.out.println("--------Car 02------");
        supra.startEngine();
        supra.accelerate();
        supra.turboMode();
        supra.moveLeft();
        supra.moveRight();
        supra.display();
        supra.stopEngine();
        
    }
}