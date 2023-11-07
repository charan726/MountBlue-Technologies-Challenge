import java.util.*;
public class GradingStudents{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            a[i]=round(a[i]);
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static int round(int x){
        int n=x/5;
        if((5*(n+1)-x) < 3 && x>=40)
            return 5*(n+1);
        else
            return x;
    }
}