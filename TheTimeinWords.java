import java.util.*;
public class TheTimeinWords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        String[] numbers = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen","nineteen"};
        String[] tens = {"", "", "twenty", "half",};
        if(m==0){
            System.out.print(numbers[h]+" o' clock");
        }
        else if(m<30){
            if(m==1){
                System.out.print(numbers[m]+" minute past "+ numbers[h]);
                return;
            }
            if(m==15){
                System.out.print(numbers[m]+" past "+ numbers[h]);
                return;
            }
            if(m>=20){
                System.out.print(tens[2]);
                m=m-20;
                if(m!=0){
                    System.out.print(" ");
                }
            }
            System.out.print(numbers[m]+" minutes past "+ numbers[h]);
        }
        else if(m==30){
            System.out.print("half past "+numbers[h]);
        }
        else{
            m=60-m;
            if(m==1){
                System.out.print(numbers[m]+" minute to "+ numbers[h]);
                return;
            }
            if(h==12){
                h=0;
            }
            if(m==15){
                System.out.print(numbers[m]+" to "+ numbers[h+1]);
                return;
            }
            if(m>=20){
                System.out.print(tens[2]);
                m=m-20;
                if(m!=0){
                    System.out.print(" ");
                }
            }
            System.out.print(numbers[m]+" minutes to "+ numbers[h+1]);
        }
    }
}
