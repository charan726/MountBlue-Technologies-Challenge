import java.util.*;
public class JumpingontheClouds_Revisited{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ct=0,c=0;
        for(int i=k;i>0;i+=k){
            c++;
            if(i>=n){
                i=i%n;
            }
            if(a[i]==1){
                ct+=2;
            }
            if(i==0){
                break;
            }
        }
        System.out.print(100-c-ct);
    }
}
