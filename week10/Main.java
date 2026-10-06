package week10;

public class Main {
    public static void main(String[] args) {
        int[] source1=new int[]{1,2,3,4,5,6,7,8,9};
        int[] source2=new int[]{1,2,3,4,5,6,7,8,9};
        Matrix m1=new Matrix(3,3,source1);
        Matrix m2=new Matrix(3,3,source2);
        System.out.println("initial state of m1\n"+m1+"\n initial state of m2\n"+m2);
        System.out.println("m1 equals m2:"+m1.equals(m2));
        System.out.println("hashcode of m1:"+m1.hashCode());
        System.out.println("hashcode of m2"+m2.hashCode());
        m1.setX(2,2,60);
        System.out.println("m1 after setters:\n"+m1);
        System.out.println("equals after setting new values:"+m1.equals(m2));
        m1.swap(1,2);
        System.out.println("after swapping:\n"+m1);

    }
}
