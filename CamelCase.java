import java.util.*;
public class CamelCase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int ans=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)< 'a'){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
