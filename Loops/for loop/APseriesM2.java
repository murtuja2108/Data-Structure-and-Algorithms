package Loops.For;

import java.util.Scanner;

public class APseriesM2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
        System.out.print("Enter AP series first element: ");
        int a=sc.nextInt();
        System.out.print("Enter AP series difference: ");
        int d=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a+=d;//1,3,5,7
        }
    }
}
