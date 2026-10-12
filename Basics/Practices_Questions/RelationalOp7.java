package Basics.PracticeQuestions;

import java.util.Scanner;

public class RelationalOp7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Are numbers equal?\n"+(a==b));
        System.out.println("Are numbers not equal?\n"+(a!=b));
        System.out.println("Is the first number greater?\n"+(a>b));
        System.out.println("Is the first number less?\n"+(a<b));
    }
}
