package arrays.week05Array;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Array v1=new Array();
        Array v2=(Array) v1.clone();
        System.out.println("v1:"+v1);
        System.out.println("v2:"+v2);
        v2.increment();
        System.out.println("v2 after increment:"+v2);
        System.out.println("v1 after increment:"+v1);

    }
}
