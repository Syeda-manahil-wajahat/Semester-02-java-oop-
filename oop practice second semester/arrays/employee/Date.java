package arrays.employee;

import javax.management.RuntimeErrorException;

public class Date implements Cloneable {
    private int day; 
    private int month;
    private int year;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    @Override 
    public String toString(){
        return day+"/"+month+"/"+year;
    }
    @Override 
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof Date)) return false;
        Date that=(Date) obj;
        return  this.day==that.day &&
        this.month==that.month &&
        this.year==that.year;
    }
    public Object clone(){
     try{
            Date d=(Date) super.clone();
           return d;}
           catch(CloneNotSupportedException e){
            throw new RuntimeException(e);
           }
    }

}
