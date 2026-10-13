package Patterns.Composites;

import java.util.Scanner;

public class NumberPyramidPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            for(int l=i-1;l>0;l--){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
