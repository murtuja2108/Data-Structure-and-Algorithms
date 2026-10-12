package Conditionals;

import java.util.Scanner;

public class GreatestOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        System.out.print("Enter third number: ");
        int z=sc.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x+" is greatest number.");
            }else{
                System.out.println(z+" is greatest number.");
            }
        }
        else{
            if(y>z){
                System.out.println(y+" is greatest number.");
            }else{
                System.out.println(z+" is greatest number.");
            }
        }
    }
}
