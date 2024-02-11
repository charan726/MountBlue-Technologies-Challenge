import java.util.*;
public class EqualizetheArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=1,ct=1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(a[i]==a[i-1]){
                ct++;
                if(max<ct)
                    max=ct;
            }
            else{
                ct=1;
            }
        }
        System.out.print(n-max);
    }
}
