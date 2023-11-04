import java.util.*;
public class ComparetheTriplets{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        int b[]=new int[3];
        int ap=0,bp=0;
        for(int i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i]=sc.nextInt();
            if(b[i]>a[i]){
                bp++;
            }
            else if(a[i]>b[i]){
                ap++;
            }
        }
        System.out.print(ap+" "+bp);
    }
}