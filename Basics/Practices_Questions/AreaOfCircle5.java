package Basics.PracticeQuestions;

import java.util.Scanner;

public class AreaOfCircle5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the redius of the circle: ");
        double red=sc.nextDouble();
        double pi=3.141;
        double area=pi*red*red;
        System.out.println("Area of the circle is: "+area);
    }
}
