import java.util.*;
public class LibraryFine{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        
        int ans=0;
        if(y1==y2){
            if(m1==m2){
                if(d1>d2)
                    ans=15*(d1-d2);
            }
            else if(m1>m2){
                ans=500*(m1-m2);
            }
        }
        else if(y1>y2){
            ans=10000*(y1-y2);
        }
        System.out.print(ans);
    }
}