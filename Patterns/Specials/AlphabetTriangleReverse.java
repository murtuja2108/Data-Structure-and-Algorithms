package Patterns.Specials;

import java.util.Scanner;

public class AlphabetTriangleReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of column: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
