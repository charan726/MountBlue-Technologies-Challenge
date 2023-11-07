import java.util.*;
public class BirthdayCakeCandles{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int ct=0;
        for(int i=n-1;i>=0;i--){
            if(a[i]==a[n-1]){
                ct++;
            }
        }
        System.out.print(ct);
    }
}