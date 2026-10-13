package Loops.While;

import java.util.Scanner;

public class DoWhileSyntax {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        // In do while loop, 1 time must executed the body of the loop then check the condition and then repeate or stop.
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
