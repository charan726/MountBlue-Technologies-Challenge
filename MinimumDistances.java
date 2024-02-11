import java.util.*;
public class MinimumDistances{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int min=-1;
        for(int i=0;i<n;i++){
            int l=lastInd(a,i);
            if(l != i){
                if(min==-1 || min>l-i ){
                    min=l-i;
                }
            }
        }
        System.out.println(min);
    }
    public static int lastInd(int[] a,int x){
        for(int i=a.length-1;i>=0;i--){
            if(a[i] ==a[x]){
                return i;
            }
        }
        return -1;
    }
}
