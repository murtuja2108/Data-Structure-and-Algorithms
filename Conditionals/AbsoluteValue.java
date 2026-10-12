package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x=sc.nextInt();
        if(x<0){
            System.out.println("Absolute value of the given number is: "+-x);
        }else{
            System.out.println("Absolute value of the given number is: "+x);
        }
    }
}
