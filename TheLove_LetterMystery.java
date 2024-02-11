import java.util.*;
public class TheLove_LetterMystery{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(count(a[i]));
        }
    }
    public static int count(String a){
        char c[]=a.toCharArray();
        int ct=0;
        for(int i=0,j=c.length-1;i<c.length/2;i++,j--){
            ct+= (int)c[i]>(int)c[j]?(int)c[i]-(int)c[j]:(int)c[j]-(int)c[i];
        }
        return ct;
    }
}
