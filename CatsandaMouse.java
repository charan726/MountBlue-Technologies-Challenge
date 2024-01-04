import java.util.*;
public class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int ca=z-x,cb=z-y;
            if(ca<0)
                ca=-ca;
            if(cb<0)
                cb=-cb;
            if(ca>cb)
                System.out.println("Cat B");
            else if(ca<cb)
                System.out.println("Cat A");
            else
                System.out.println("Mouse C");
        }
    }
}
