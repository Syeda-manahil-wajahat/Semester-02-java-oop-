public class complexNumber{

    private double real;
    private double imaginary;

    // Default / No-Argument Constructor
    public complexNumber() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized Constructor
    public complexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy Constructor
    public complexNumber(complexNumber c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // Getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Setters
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    // Addition
    public complexNumber add(complexNumber c) {
         double newReal= this.real + c.real;
         double newImaginary=this.imaginary + c.imaginary;
        return new complexNumber(newReal,newImaginary);
    }

    // Subtraction
    public complexNumber subtract(complexNumber c) {
         double newReal= this.real - c.real;
         double newImaginary= this.imaginary - c.imaginary;
        return new complexNumber(newReal,newImaginary);
    }

    // Magnitude
    public double magnitude() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // toString
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    // Display
    public void display(complexNumber c) {

    System.out.println("======================================");
    System.out.println("║          COMPLEX NUMBER            ║");
    System.out.println("======================================");

    System.out.println("Current Number  : " + this);
    System.out.println("Other Number    : " + c);

    System.out.println("Addition        : " + add(c));
    System.out.println("Subtraction     : " + subtract(c));
    System.out.println("Magnitude       : " + magnitude());
}
        
} 
