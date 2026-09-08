package arrays.week05RationalNumber;

import java.util.Objects;

public class RationalNumber {
    private int numerator;
    private int denominator;
    public RationalNumber(int numerator,int denominator){
        if(denominator==0){
            throw new IllegalArgumentException("denominator cant be zero ");
        }
        this.numerator=numerator;
        this.denominator=denominator;
    }
    //overload
    // public boolean equals(RationalNumber obj){
    //    return obj!=null&&this.numerator==obj.numerator&&this.denominator==obj.denominator;
    // }
     @Override 
    public boolean equals(Object obj){
        if(this==obj) return  true;
        if(obj==null) return false;
        if(!(obj instanceof RationalNumber)) return false;
        RationalNumber that=(RationalNumber)obj;
        return this.numerator==that.numerator&& this.denominator==that.denominator;
    }
    @Override 
    public int hashCode(){
        return Objects.hash(this.numerator,this.denominator);
    }
}
