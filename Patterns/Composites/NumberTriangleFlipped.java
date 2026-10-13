package Patterns.Composites;

import java.util.Scanner;

public class NumberTriangleFlipped {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
