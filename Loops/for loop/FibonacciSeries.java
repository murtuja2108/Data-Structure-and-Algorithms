package Loops.For;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
		/*fiboacci series start with 1,1,next term is (addition of previous 2 term) means (1+1=2),next terms is (addition of previous 2 term)
		means (1+2=3) and so on.
		*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n-th term which you want to print: ");
        int n=sc.nextInt();
        System.out.print("Enter 1st term of the Fibonacci Series: ");
        int f=sc.nextInt();
        System.out.print("Enter 2nd term of the Fibonacci Series: ");
        int s=sc.nextInt();
        int nT=0;
        //System.out.println(f);
        for(int i=1;i<=n-2;i++){
            nT=f+s;
            System.out.println(nT);
            f=s;
            s=nT;
        }
    }
}
