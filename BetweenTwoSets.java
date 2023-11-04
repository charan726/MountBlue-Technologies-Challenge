import java.util.*;
public class BetweenTwoSets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int ans=0;
        Arrays.sort(a);
        Arrays.sort(b);
        int l=a[n-1];
        for(int i=0;i<n;i++){
            l=LCM(l,a[i]);
        }
        for(int i=l;i<=b[0];i+=l){
            if(sol(i,b)){
                ans++;
            }
        }
        System.out.print(ans);
    }
    public static boolean sol(int x,int b[]){
        for(int i=0;i<b.length;i++){
            if(b[i]%x!=0){
                return false;
            }
        }
        return true;
    }
    public static int LCM(int a,int b){
        if(a%b==0){
            return a;
        }
        int i=a;
        while(i<a*b){
            if(i%b==0){
                return i;
            }
            i+=a;
        }
        return a*b;
    }
}