import java.util.*;
public class MaximumPerimeterTriangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int[] ans=findMax(a);
        for(int i:ans){
            System.out.print(i+" ");
        }
     }
    public static int[] findMax(int a[]){
        int n=a.length;
        int temp[]=new int[3];
        for(int i=n-1;i>=2;i--){
            if(isValid(a,i)){
                temp[0]=a[i-2];
                temp[1]=a[i-1];
                temp[2]=a[i];
                return temp;
            }
        }
        return new int[]{-1};
    }
    public static boolean isValid(int a[],int i){
        i-=2;
        if(a[i]+a[i+1]<=a[i+2]  || a[i+1]+a[i+2]<=a[i] || a[i+2]+a[i]<=a[i+1] || a[i+1]-a[i]>=a[i+2] ||a[i+2]-a[i+1]>=a[i]||a[i+2]-a[i]>=a[i+1]){
            return false;
        }
        return true;
    }
}
