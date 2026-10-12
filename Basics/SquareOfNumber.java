package Basics;

import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        int square=x*x;
        System.out.println("The square of the given number is : "+square);
    }
}
