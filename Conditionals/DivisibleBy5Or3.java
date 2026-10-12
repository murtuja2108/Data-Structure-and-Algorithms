package Conditionals;

import java.util.Scanner;

public class DivisibleBy5Or3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n%3==0 || n%5==0){
            System.out.println("Entered number is divisible by 3 or 5.");
        }else{
            System.out.println("Entered number is not divisible by 3 or 5.");
        }
    }
}
