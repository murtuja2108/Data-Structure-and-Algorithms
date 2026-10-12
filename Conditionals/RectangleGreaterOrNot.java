package Conditionals;

import java.util.Scanner;

public class RectangleGreaterOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the Rectangle : ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth=sc.nextDouble();
        double area;
        area=(length* breadth);
        double perimeter;
        perimeter=2*(length + breadth);
        if(area>perimeter){
            System.out.println("Area is greater than the perimeter of that Rectangle.");
        }else if(area == perimeter){
            System.out.println("Area and Perimeter both are equal of that rectangle.");
        }else{
            System.out.println("Perimeter is greater than the area of that Rectangle.");
        }
    }
}
