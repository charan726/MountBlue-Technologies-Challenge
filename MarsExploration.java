import java.util.*;
public class MarsExploration{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        String es="";
        for(int i=0;i<=n/3;i++){
            es = es + "SOS";
        }
        int d=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) != es.charAt(i)){
                d++;
            }
        }
        System.out.print(d);
    }
}
