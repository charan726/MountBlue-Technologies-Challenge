import java.util.*;
public class BillDivision{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i!=k){
                sum+=a[i];
            }
        }
        int bc=sc.nextInt();
        if(bc==sum/2){
            System.out.print("Bon Appetit");
        }
        else{
            System.out.print(-(sum/2)+bc);
        }
    }
}