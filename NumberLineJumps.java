import java.util.*;
public class NumberLineJumps{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        float n=(float)(a-x)/(float)(y-b);
        float d= n/(int)n;
        if(n<1 || d!=1){
            System.out.print("NO");
        }
        else{
            System.out.print("YES");
        }
    }
}