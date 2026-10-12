package Conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st operand: ");
        int a=sc.nextInt();
        System.out.print("Enter Operator: ");
        char c=sc.next().charAt(0);
        System.out.print("Enter second operand: ");
        int b=sc.nextInt();
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}
