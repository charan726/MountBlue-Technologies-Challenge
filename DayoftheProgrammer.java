import java.util.*;
public class DayoftheProgrammer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year==1918){
            System.out.print("26.09."+year);
            return;
        }
        if(leap(year)){
            System.out.print("12.09."+year);
        }
        else{
            System.out.print("13.09."+year);
        }
    }
    public static boolean leap(int y){
        if(y<1917){
            if(y%4==0){
                return true;
            }
        }
        else{
            if(y%400==0 || (y%4==0 && y%100!=0)){
                return true;
            }
        }
        return false;
    }
}
