import java.util.*;
public class Main{
    static String temp="";
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        String ans=reduce(s);
        if(ans.length()==0)
            System.out.print("Empty String");
        else
            System.out.print(ans);
    }
    public static String reduce(String s){
        int x=0,y=0,n=s.length();
        String templc=s;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                y=i+1;
                
            }
            else{
                if(y>x){
                    if((y+1-x) % 2==0 ){
                        s=""+s.substring(0,x)+s.substring(y+1,s.length());
                        temp=s;
                        break;
                    }
                    else{
                        s=s.substring(0,x)+s.substring(y,s.length());
                        temp=s;
                        break;
                    }
                }
                x=i+1;
            }
            if(i==n-2){
                if(y>x){
                    if((y+1-x) % 2==0 ){
                        s=""+s.substring(0,x)+s.substring(y+1,s.length());
                        temp=s;
                        break;
                    }
                    else{
                        s=s.substring(0,x)+s.substring(y,s.length());
                        temp=s;
                        break;
                    }
                }
            }
            
        }
        if(! (temp.equals(templc))){
            return reduce(temp);
        }
        return temp;
    }
}
