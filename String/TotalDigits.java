package Strings;

import java.util.Scanner;

public class TotalDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=""+n;
        int x=s.length();
        System.out.println(x);
        //using toString method
        String ss=Integer.toString(n);
        System.out.println(ss.length());
    }
}
