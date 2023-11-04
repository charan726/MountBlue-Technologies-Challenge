import java.util.*;
public class Quicksort1Partition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=a[0];
        int b[]=new int[n];
        int k=0;
        for(int i=1;i<n;i++){
            if(a[i]<p){
                b[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==p){
                b[k]=a[i];
                k++;
            }
        }
        for(int i=1;i<n;i++){
            if(a[i]>p){
                b[k]=a[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(b[i]+" ");
        }
    }
}