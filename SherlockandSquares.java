import java.util.*;
public class SherlockandSquares{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int t1=(int)Math.sqrt(a);
            int t2=(int)Math.sqrt(b);
            if(t1*t1==a){
                System.out.println(t2-t1+1);
            }
            else
                System.out.println(t2-t1);
        }
    }
}
