import java.util.*;
public class TheHurdleRace{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(max<a[i])
                max=a[i];
        }
        if(k<max)
            System.out.print(max-k);
        else
            System.out.print(0);
    }
}
