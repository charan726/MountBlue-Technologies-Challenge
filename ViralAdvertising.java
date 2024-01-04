import java.util.*;
public class ViralAdvertising{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=5,l=2,cum=2;
        for(int i=1;i<n;i++){
            s=l*3;
            l=(s/2);
            cum+=l;
        }
        System.out.println(cum);
    }
}
