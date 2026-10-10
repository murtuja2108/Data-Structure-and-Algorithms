package Basics;

import java.util.Scanner;

public class SimpleInn {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        double p=sc.nextDouble();//P=Principal
        System.out.print("Enter interest rate per year: ");
        double r=sc.nextDouble();//R=Rate of Interest
        System.out.print("Enter time period: ");
        double t=sc.nextDouble();//T=Time period
        double si=p*r*t/100;
        System.out.println("Simple interest of "+p+" rupees in "+t+" years with "+r+" interest rate is : "+si+" Rupee.");
    }
}
