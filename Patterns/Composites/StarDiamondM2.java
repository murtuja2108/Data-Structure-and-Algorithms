package Patterns.Composites;

import java.util.Scanner;

public class StarDiamondM2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("* ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nsp=1;
        nst-=4;
        for(int l=1;l<=n-1;l++){
            for(int o=1;o<=nsp;o++){
                System.out.print("  ");
            }
            for(int m=1;m<=nst;m++){
                System.out.print("* ");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }
}
