import java.util.*;
public class SubarrayDivision{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int ct=0;
        for(int i=0;i<n-m+1;i++){
            if(subarraysum(a,i,i+m,d)){
                ct++;
            }
        }
        System.out.print(ct);
    }
    public static boolean subarraysum(int[] a,int in,int m,int d){
        int x=0;
        for(int i=in;i<m;i++){
            x+=a[i];
        }
        if(x==d){
            return true;
        }
        return false;
    }
}
