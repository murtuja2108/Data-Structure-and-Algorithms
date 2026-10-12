package Conditionals;

import java.util.Scanner;

public class SmallestOf3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        int a=sc.nextInt();
        System.out.print("Enter the age of Shyam: ");
        int b=sc.nextInt();
        System.out.print("Enter the age of Ajay: ");
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("Ram is youngest of them.");
            }else{
                System.out.println("Ajay is youngest of them.");
            }
        }else{
            if(b<c){
                System.out.println("Shyam is youngest of them.");
            }else{
                System.out.println("Ajay is youngest of them.");
            }
        }
    }
}
