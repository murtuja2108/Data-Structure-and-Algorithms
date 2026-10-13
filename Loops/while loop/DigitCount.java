package Loops.While;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Entered input is "+count+" Digit.");
    }
}
