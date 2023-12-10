import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int ans=solution(arr);
            if(ans==0){
                System.out.println("ANDY");
            }
            else{
                System.out.println("BOB");
            }
        }
    } 
    public static int index(int[] a,int n){
        int max=0,mi=0;
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max=a[i];
                mi=i;
            }
        }
        return mi;
    }
    public static int solution(int[] a){
        int ct=0;
        int n=a.length;
        while(true){
            if(n==0){
                break;
            }
            else{
                ct++;
                n=index(a,n);
            }
        }
        return ct%2;
    }
}
