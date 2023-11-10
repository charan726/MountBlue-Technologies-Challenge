import java.util.*;
class TimeConversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String a=s.substring(8,10);
        int x=Integer.parseInt(s.substring(0,2));
        String p="PM";
        if(a.equals(p)){
            if(x!=12)
                x+=12;
        }
        else if(x==12){
            x-=12;
        }
        a=String.valueOf(x);
        if(a.length()==1){
            a="0"+a;
        }
        s=a+s.substring(2,8);
        System.out.print(s);
        
    }
}