public class Date {
    private int day;
    private int month;
    private int year;
    public Date(){
        this.day=1;
        this.month=1;
        this.year=2000;
    }
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public Date(Date obj){
        this.day=obj.day;
        this.month=obj.month;
        this.year=obj.year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        this.day=day;
    }
     public void setMonth(int month){
        this.month=month;
    }
     public void setYear(int year){
        this.year=year;
    }
    public String toString(){
        return "JOINING DATE: "+day+",MONTH:"+month+",YEAR:"+year;
    }
}
