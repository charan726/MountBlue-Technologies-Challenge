import java.util.*;
public class CircularArrayRotation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int q=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[q];
        while(k>n){
            k=k%n;
        }
        for(int i=k;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            System.out.println(a[b[i]]);
        }
    }
}
