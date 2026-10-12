package Conditionals;

import java.util.Scanner;

public class GreatestOfThreeNo {
    public static void main(String[] args){
        // Logical Operrator -> (&&,||)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        System.out.print("Enter third number: ");
        int z=sc.nextInt();
        if(x>=y && x>=z){
            System.out.println("lerge number is "+x);
        }
        else if(y>=x && y>=z){
            System.out.println("Lerger number is "+y);
        }else{
            System.out.println("Lerge number is "+z);
        }
    }
}
