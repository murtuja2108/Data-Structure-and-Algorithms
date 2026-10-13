package Loops.For;

import java.util.Scanner;

public class FibonacciSeriesUptoN {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n-th term which you want to print: ");
        int n=sc.nextInt();
        System.out.print("Enter 1st term of the Fibonacci Series: ");
        int f=sc.nextInt();
        System.out.print("Enter 2nd term of the Fibonacci Series: ");
        int s=sc.nextInt();
        int nT=0;
        for(int i=1;i<=n-2;i++){
            nT=f+s;
            System.out.println(i+2+" term of Fibonacci Series is "+nT);
            f=s;
            s=nT;
        }
    }
}
