package Methods;

import java.util.Scanner;

public class EveryThingInOneClass {
    public int digit(int x){
        int count=0;
        while(x!=0){
            x/=10;
            count++;
        }
        return count;
    }

    public void square(int x){
        while(x!=0){
            int dig=x%10;
            x/=10;
            int Square=dig*dig;
            System.out.println("Square of "+dig+" is "+Square);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        EveryThingInOneClass digi=new EveryThingInOneClass();
        int Digit=digi.digit(n);
        System.out.println("Total digit is : "+Digit);
        EveryThingInOneClass squa=new EveryThingInOneClass();
        squa.square(n);
    }
}
