import java.util.*;
public class DrawingBook{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[(n/2)+1][2];
        int x=0,ct=0;
        for(int i=0;i<(n/2)+1;i++){
            a[i][0]=x;
            if(x==k){
               break; 
            }
            x++;
            a[i][1]=x;
            if(x==k){
                break;
            }
            x++;
            ct++;
        }
        if((n/2)-ct <ct){
            System.out.print((n/2)-ct);
        }
        else{
            System.out.print(ct);
        }
    }
}