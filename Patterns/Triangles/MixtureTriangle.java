package Patterns.Triangle;

import java.util.Scanner;

public class MixtureTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                for(int j=1;j<=i;j++){
                    System.out.print((char)(j+64)+" ");
                }
            }
            else{
                for(int k=1;k<=i;k++){
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }
    }
}
