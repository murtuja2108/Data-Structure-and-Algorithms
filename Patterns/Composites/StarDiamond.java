package Patterns.Composites;

import java.util.Scanner;

public class StarDiamond {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        n--;
        int a=2*n-1;
        for(int l=1;l<=n;l++){
            for(int o=1;o<=l;o++){
                System.out.print("  ");
            }
            for(int m=1;m<=a;m++){
                System.out.print("* ");
            }
            a-=2;
            System.out.println();
        }
    }
}
