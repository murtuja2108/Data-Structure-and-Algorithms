package Loops.For;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        boolean b=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println(n+" is a Composite Number with minimum factor "+i+".");
                b=false;
                break;
            }
        }
        if(n==1){
            System.out.println(n+" is neither Prime Number nor Composite Number.");
        }
        else if(b==true){
            System.out.println(n+" is a Prime Number.");
        }
    }
}
