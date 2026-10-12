package Conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Entered number is a Even number.");
        }
		/*if(a%2!=0 or [a%2==1]){
			System.out.println("Entered number is a Odd number.");
		}*/
        else{
            System.out.println("Entered number is a Odd number.");
        }
    }
}
