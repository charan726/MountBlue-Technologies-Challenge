import java.util.*;
public class TowerBreakers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int a[]=new int[n];
            if (n%2==0||m==1)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
    
}
