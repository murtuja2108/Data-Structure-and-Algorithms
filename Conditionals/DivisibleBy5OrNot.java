package Conditionals;

import java.util.Scanner;

public class DivisibleBy5OrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        if(x%5==0){
            System.out.println("Number is Divisible by 5.");
        }else{
            System.out.println("Number is not Divisible by 5.");
        }
    }
}
