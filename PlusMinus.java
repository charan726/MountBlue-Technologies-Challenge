import java.util.*;
public class PlusMinus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        float p=0,ne=0,z=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>0){
                p++;
            }
            else if(a[i]<0)
                ne++;
            else
                z++;
        }
        System.out.println((float)(p/n));
        System.out.println((float)(ne/n));
        System.out.println((float)(z/n));
    }
}