import java.util.*;
public class BeautifulDaysattheMovies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        int ct=0;
        for(int x=i;x<=j;x++){
            if(reverse(x,k)){
                ct++;
            }
        }
        System.out.print(ct);
    }
    public static boolean reverse(int x,int k){
        int temp=x,rev=0;
        while(temp>0){
            rev=rev*10 +(temp%10);
            temp=temp/10;
        }
        temp=x-rev;
        if(temp<0)
            temp=-temp;
        if(temp%k==0){
            return true;
        }
        return false;
    }
}
