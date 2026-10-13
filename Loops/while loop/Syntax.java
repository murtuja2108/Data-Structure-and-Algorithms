package Loops.While;

import java.util.Scanner;

public class Syntax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of time you want to print: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("Hello World!");
            i++;
        }
    }
}
