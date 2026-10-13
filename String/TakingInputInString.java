package Strings;

import java.util.Scanner;

public class TakingInputInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        //next() is used for taking one word
        //nextLine() is used for taking sentence
        String s=sc.nextLine();
        System.out.print("Hi ");
        System.out.println(s);
    }
}
