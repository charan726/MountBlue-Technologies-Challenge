import java.util.*;
public class MigratoryBirds{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ct=1,ans=a[0],max=1;
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                ct++;
            }
            else{
                if(ct>max){
                    ans=a[i-1];
                    max=ct;
                }
                ct=1;
            }
        }
        if(ct>max){
            ans=a[n-1];
        }
        System.out.print(ans);
    }
}