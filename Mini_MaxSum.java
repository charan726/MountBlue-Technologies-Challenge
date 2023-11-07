import java.util.*;
public class Mini_MaxSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a[]=new long[5];
        long sum=0;
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        long max=sum-a[0];
        long min=sum-a[4];
        System.out.print(min+" "+max);
    }
}