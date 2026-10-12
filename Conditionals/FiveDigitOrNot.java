package Conditionals;

import java.util.Scanner;

public class FiveDigitOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if(n>9999 && n<100000){
            System.out.println("Entered number is a five digit number.");
        }else{
            System.out.println("Entered number is not a five digit number.");
        }
    }
}
