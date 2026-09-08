package arrays.week05RationalNumber;

public class Main {
    public static void main(String[] args) {
        RationalNumber r1=new RationalNumber(10,5 );
        RationalNumber r2=new RationalNumber(10,5 );
        Object o1=r1;
        Object o2=r2;
        System.out.println("r1.equals(r2)"+r1.equals(r2));
        System.out.println("o1.equals(o2)"+o1.equals(o2));
        System.out.println("r1.equals(o2)"+r1.equals(o2));
        System.out.println("o1.equals(r2)"+o1.equals(r2));
        System.out.println("r1.equals(o1)"+r1.equals(o1));
        System.out.println("hashcode:"+r1.hashCode());
    }   
}
