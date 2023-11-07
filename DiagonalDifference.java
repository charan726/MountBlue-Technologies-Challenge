import java.util.*;
public class DiagonalDifference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int d1=0,d2=0;
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                if(i==j){
                    d1+=a[i][j];
                }
                if(j==k){
                    d2+=a[i][j];
                    k--;
                }
            }
        }
        int ans=0;
        if(d2>d1)
            ans=d2-d1;
        else
            ans=d1-d2;
        System.out.print(ans);
    }
}