public class main {

    public static void main(String[] args) {
// object created in heap with default constructor
        Calculator calculator1 = new Calculator();
// object created in heap with parameterized constructor
        Calculator calculator2 = new Calculator(999, 6);

        System.out.println("Calculator 1:");
// function called through reference variable
        calculator1.display();
// function called through reference variable
        System.out.println("Calculator 2:");
        calculator2.display();
        System.out.println("Normal Modulus Case:");
        System.out.println("999 % 6 = " + calculator2.modulus());
        Calculator modulusEdgeCase = new Calculator(111, 0);
        System.out.println("Modulus Edge Case:");
        System.out.println("111 % 0 = "+ modulusEdgeCase.modulus());
        System.out.println("Normal Division Case:");
        System.out.println("999 / 6 = " + calculator2.divide());
        System.out.println("Division Edge Case:");
        System.out.println("111 / 0 = " + modulusEdgeCase.divide());
        System.out.println("Average:");
        System.out.println("Average = " + calculator2.average());
    }
}

