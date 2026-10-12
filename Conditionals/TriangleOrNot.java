package Conditionals;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side: ");
        double s1=sc.nextDouble();
        System.out.print("Enter second side: ");
        double s2=sc.nextDouble();
        System.out.print("Enter third side: ");
        double s3=sc.nextDouble();
        if(s1+s2>s3){
            if (s2+s3>s1){
                if (s3+s1>s2){
                    System.out.println("This is a valid Triangle.");
                }
                else{
                    System.out.println("This is not a valid Triangle.");
                }
            }
            else{
                System.out.println("This is not a valid Triangle.");
            }
        }
        else{
            System.out.println("This is not a valid Triangle.");
        }
        /*also below scode is valid
        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2){
        }else{
        }
        */
    }
}
