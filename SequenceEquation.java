import java.util.*;
public class SequenceEquation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=a.length;i++){
            System.out.println(index(a,index(a,i)));
        }
    }
    public static int index(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
                return i+1;
        }
        return -1;
    }
}
