package Basics;

public class SimpleInterest {
    public static void main(String[] args)
    {
        double p=100;//P=Principal
        double r=2;//R=Rate of Interest
        double t=2.5;//T=Time period
        double si=p*r*t/100;
        System.out.println("Simple interest of "+p+" rupees in "+t+" years with "+r+" interest rate is : "+si+" Rupee.");
    }
}
