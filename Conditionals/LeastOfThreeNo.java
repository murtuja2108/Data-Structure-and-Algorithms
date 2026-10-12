package Conditionals;

import java.util.Scanner;

public class LeastOfThreeNo {
    public static void main(String[] args){
        // Logical Operrator -> (&&,||)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x=sc.nextInt();
        System.out.print("Enter second number: ");
        int y=sc.nextInt();
        System.out.print("Enter third number: ");
        int z=sc.nextInt();
        if(x<=y && x<=z){
            System.out.println("Least number is "+x);
        }
        else if(y<=x && y<=z){
            System.out.println("Least number is "+y);
        }else{
            System.out.println("Least number is "+z);
        }
    }
}
