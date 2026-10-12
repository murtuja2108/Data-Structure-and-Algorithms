package Basics;

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a chaterter: ");
        char ch=sc.next().charAt(0);
        System.out.println((int)ch);
        System.out.println(ch);
    }
}
