package Patterns.Composites;

import java.util.Scanner;

public class NumberBridge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        n--;
        for(int j=1;j<=n;j++){
            int count=1;
            for(int k=1;k<=n+1-j;k++){
                System.out.print(count+" ");
                count++;
            }
            for(int l=1;l<=2*j-1;l++){
                System.out.print("  ");
                count++;
            }
            for(int m=1;m<=n+1-j;m++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
