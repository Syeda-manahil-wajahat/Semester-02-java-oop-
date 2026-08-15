public class rationalNumber {

    private int numerator;
    private int denominator;
    private static int objCount = 0;

    // Null / Default Constructor
    public rationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
        objCount++;
    }

    // Parameterized Constructor
    public rationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        objCount++;
    }

    // Copy Constructor
    public rationalNumber(rationalNumber r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
        objCount++;
    }

    // Getters
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Setters
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    // Addition
    public rationalNumber add(rationalNumber r) {
        int newNumerator =
                this.numerator * r.denominator
                + r.numerator * this.denominator;

        int newDenominator =
                this.denominator * r.denominator;

        return new rationalNumber(newNumerator, newDenominator);
    }

    // Subtraction
    public rationalNumber subtract(rationalNumber r) {
        int newNumerator =
                this.numerator * r.denominator
                - r.numerator * this.denominator;

        int newDenominator =
                this.denominator * r.denominator;

        return new rationalNumber(newNumerator, newDenominator);
    }

    // Multiplication
    public rationalNumber multiply(rationalNumber r) {
        return new rationalNumber(
                this.numerator * r.numerator,
                this.denominator * r.denominator
        );
    }

    // Division
    public rationalNumber divide(rationalNumber r) {
        return new rationalNumber(
                this.numerator * r.denominator,
                this.denominator * r.numerator
        );
    }

    // Unique Function
    public double toDecimal() {
        return (double) numerator / denominator;
    }

    // Object Count
    public static int getObjCount() {
        return objCount;
    }

    // toString
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Display
    public void display(rationalNumber r) {

        System.out.println("========================================");
        System.out.println("||         RATIONAL NUMBER            ||");
        System.out.println("========================================");
        System.out.println("Rational Number : " + this);
        System.out.println("Other Number    : " + r);
        System.out.println("Addition        : " + add(r));
        System.out.println("Subtraction     : " + subtract(r));
        System.out.println("Multiplication   : " + multiply(r));
        System.out.println("Division        : " + divide(r));
        System.out.println("Decimal Value   : " + toDecimal());

        
    }
}
