import java.util.*;
public class SavethePrisoner{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            m=m+s-1;
            if(m%n==0){
                System.out.println(n);
            }
            else{
                System.out.println(m%n);
            }
        }
    }
}
