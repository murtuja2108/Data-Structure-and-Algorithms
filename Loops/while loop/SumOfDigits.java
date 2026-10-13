package Loops.While;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int lastDigit=0,sum=0;
        while(n!=0){
            lastDigit=n%10;
            n/=10;
            sum+=lastDigit;
        }
        System.out.println("Sum of the digits is "+sum);
    }
}
