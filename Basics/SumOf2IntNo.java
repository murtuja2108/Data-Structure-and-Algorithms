package Basics;

import java.util.Scanner;

public class SumOf2IntNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int x=sc.nextInt();
        System.out.print("Enter second integer number: ");
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum of two given integer number is : "+sum);
    }
}
