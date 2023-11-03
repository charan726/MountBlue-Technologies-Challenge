import java.util.*;
public class Main{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s[]=new int[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        int min=s[0],max=s[0];
        int minct=0,maxct=0;
        for(int i=0;i<n;i++){
            if(min>s[i]){
                min=s[i];
                minct++;
            }
            if(max<s[i]){
                max=s[i];
                maxct++;
            }
        }
        System.out.println(maxct+" "+minct);
    }
}