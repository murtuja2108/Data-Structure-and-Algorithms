package Basics.PracticeQuestions;

import java.util.Scanner;

public class PercentageOf5Sub {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Subject: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Subject: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd Subject: ");
        int c=sc.nextInt();
        System.out.print("Enter 4th Subject: ");
        int d=sc.nextInt();
        System.out.print("Enter 5th Subject: ");
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        double per=sum/5;
        System.out.println("Percentage of given five subject is: "+per);
    }
}
