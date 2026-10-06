package week10;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;


class Matrix {
    private int rows;
    private int columns;
    private int[] data;

    public Matrix(int rows,int columns,int[]source){
        this.rows=rows;
        this.columns=columns;
        this.data=source.clone();
    }
    public Matrix(Matrix other){
        this.rows=other.rows;
        this.columns=other.columns;
        this.data=other.data.clone();
    }
    public int getX(int rows,int columns){
        int index=rows*this.columns+columns;
        return this.data[index];
    }
    public void setX(int rows,int columns,int value){
        int index=rows*this.columns+columns;
        this.data[index]=value;
    }
    public Matrix deepCopy(){
        return new Matrix(this);
    }
@Override 
public int hashCode() {
    return Objects.hash(this.rows,this.columns,Arrays.hashCode(this.data));
}
@Override 
public boolean equals(Object obj){
    if (this==obj) return true;
    if(obj==null||getClass()!=obj.getClass())return false;
    Matrix other=(Matrix) obj;
    return this.rows==other.rows&&this.columns==other.columns&& Arrays.equals(this.data,other.data );
}
public String toString(){
    StringBuilder sb=new StringBuilder();
    for(int r=0;r<this.rows;r++){
        sb.append("[");
        for(int c=0;c<this.columns;c++){
            sb.append(getX(r, c));
            if(c<columns-1){
                sb.append("\t");
            }
        }
        sb.append("]\n");
    }
    return sb.toString();
}
}