import java.util.*;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        Arrays.sort(ar);
        int sol=0;
        int ct=1;
        for(int i=1;i<n;i++){
            if(ar[i]==ar[i-1]){
                ct++;
            }
            else{
                sol+= ct/2;
                ct=1;
            }
        }
        sol+=ct/2;
        System.out.println(sol);
    }
}