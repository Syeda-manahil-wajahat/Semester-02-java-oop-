package arrays.week05Array;
import java.util.Arrays;
public class Array implements Cloneable {
    private int value;
    private int[] anArray;
public Array(){
    this.value=0;
    this.anArray=new int[]{1,2,3,4,5};
}
public void increment(){
    this.value++;
    for(int i=0;i<anArray.length;i++){
        anArray[i]++;
    }
}
public String toString(){
    return "value:"+value+" , array:"+Arrays.toString(anArray);
}
public Array clone()throws CloneNotSupportedException{
    Array duplicate=(Array) super.clone();
    duplicate.anArray=new int[this.anArray.length];
    for(int i=0;i<this.anArray.length;i++){
        duplicate.anArray[i]=this.anArray[i];
    }
    return duplicate;
}
}
