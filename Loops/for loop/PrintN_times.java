package Loops.For;

import java.util.Scanner;

public class PrintN_times {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of times you print the statement: ");
        int a=sc.nextInt();
        int i;
        for(i=1;i<=a;i++){
            System.out.println("Hello World");
        }
        System.out.print(i);
    }
}
