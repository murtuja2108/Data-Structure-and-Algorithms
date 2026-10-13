package Loops.For;

import java.util.Scanner;

public class GPseries {
    public static void main(String[] args){
        //Geometric Progression -> GP series
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter First term of the GP series: ");
        int a=sc.nextInt();
        System.out.print("Enter the Multipling factor b/w GP series Elements: ");
        int d=sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println(a);
            a*=d;
        }
    }
}
