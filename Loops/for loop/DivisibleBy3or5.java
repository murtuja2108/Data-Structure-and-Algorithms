package Loops.For;

import java.util.Scanner;

public class DivisibleBy3or5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
}
