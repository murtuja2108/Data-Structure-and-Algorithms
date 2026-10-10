package Basics;

import java.util.Scanner;

public class AreaOfCircleInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of the circle: ");
        double radius=sc.nextDouble();
        double area=3.141*radius*radius;
        System.out.println("Area of the circle is : "+area);
    }
}
