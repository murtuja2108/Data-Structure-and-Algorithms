package Basics.PracticeQuestions;

import java.util.Scanner;

public class SimpleIntt5 {
    public static void main(String[] args){
        /*
        Enter principal amount: 1000
        Enter rate of interest: 5
        Enter time (in years): 2
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p=sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r=sc.nextDouble();
        System.out.print("Enter time(in Years): ");
        double t=sc.nextDouble();
        double si=p*t*r/100;
        System.out.println("Sinple interest is: "+si);
    }
}
