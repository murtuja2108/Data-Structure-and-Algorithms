package Basics;

import java.util.Scanner;

public class HalfOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter input: ");
        int x =sc.nextInt();
        System.out.println("Divided by 2 in integer : "+x/2);
        double d=x;
        System.out.print("Half of Number: "+d/2);
    }
}
