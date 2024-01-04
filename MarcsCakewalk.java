import java.util.*;
public class MarcsCakewalk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=0;i<n;i++){
            ans+= Math.pow(2,n-i-1) * a[i];
        }
        System.out.print(ans);
    }
}
