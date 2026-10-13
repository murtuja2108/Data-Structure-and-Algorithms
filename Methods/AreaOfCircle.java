package Methods;

import java.util.Scanner;

class Calculate{
    double res;
    public double area(double x){
        res=3.141*x*x;
        return res;
    }
}

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Redius: ");
        double red=sc.nextDouble();
        Calculate cal=new Calculate();
        double result=cal.area(red);
        System.out.println("Area of the gircle is : "+result);
    }
}
