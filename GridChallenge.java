import java.util.*;
public class GridChallenge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            String[] s=new String[n];
            char c[][]=new char[n][];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
                c[i]=s[i].toCharArray();
                Arrays.sort(c[i]);
            }
            if(challenge(c)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean challenge(char[][] c){
        if(c.length==1)
            return true;
        for(int i=1;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                if(c[i-1][j]>c[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
