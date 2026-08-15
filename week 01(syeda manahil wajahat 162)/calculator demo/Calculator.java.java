public class Calculator {
// attributes
    private double num1;
    private double num2;
// default/null constructor
public Calculator() {
        this.num1 = 16;
        this.num2 = 4;
    }
// parameterized constructor
 public Calculator(double newNum1, double newNum2) {
        this.num1 = newNum1;
        this.num2 = newNum2;
    }
// function
public double add() {
        return this.num1 + this.num2;
    }
// function
public double subtract() {
        return this.num1 - this.num2;
    }
// function
public double multiply() {
        return this.num1 * this.num2;
    }
// function
public double divide() {
        if (this.num2 == 0) {
            System.out.println("Error: Number can't be divide by zero.");
            return 0;
        }
        return this.num1 / this.num2;
    }
// function
public double modulus() {
        if (this.num2 == 0) {
            System.out.println("Error: Can't find modulus with zero.");
            return 0;
        }
        return this.num1 % this.num2;
    }
// function
public double average() {
        return (this.num1 + this.num2) / 2;
    }
//method
public void display() {
        System.out.println("-------- Calculator --------");
        System.out.println("Number 1: " + this.num1);
        System.out.println("Number 2: " + this.num2);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
        System.out.println("Modulus: " + modulus());
        System.out.println("Average: " + average());
        System.out.println("----------------------------");
    }
}