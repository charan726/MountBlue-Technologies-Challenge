import java.util.*;
public class CountingValleys{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int l=0,ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='U'){
                l++;
                if(l==0){
                    ans++;
                }
            }
            else{
                l--;
            }
        }
        System.out.println(ans);
    }
}