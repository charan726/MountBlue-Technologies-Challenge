import java.util.*;
public class ElectronicsShop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k[]=new int[n];
        int d[]=new int[m];
        for(int i=0;i<n;i++){
            k[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            d[i]=sc.nextInt();
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp=k[i]+d[j];
                if(temp>ans && temp<=b){
                    ans=temp;
                }
            }
        }
        System.out.print(ans);
    }
    
}
