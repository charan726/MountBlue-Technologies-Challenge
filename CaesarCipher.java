import java.util.*;
public class CaesarCipher{
    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String s=sc.next();
        int x=sc.nextInt();
        char b[]=new char[n];
        int i=0;
        for (char c : s.toCharArray()) {
            if((c>64 && c<91)|| (c>96 && c<123)){
                int sum=(int)c+x;
                while(sum>90 && (int)c<91){
                    sum=sum-90;
                    sum=sum+64;
                }
                while(sum>122){
                    sum=sum-122;
                    sum=sum+96;
                }
                b[i++]=(char)sum;
            }
            else{
                b[i++]=c;
            }
            System.out.print(b[i-1]);
        }
    }
}
