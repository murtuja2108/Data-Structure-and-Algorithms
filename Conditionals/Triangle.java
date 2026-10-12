package Conditionals;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
		/*
		An equilateral triangle is a triangle in which all three sides are equal.
		A scalene triangle is a triangle that has three unequal sides.
		An isosceles triangle is a triangle with (at least) two equal sides.
		*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st side of the triangle: ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd side of the triangle: ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd side of the triangle: ");
        int c=sc.nextInt();
        if(a==b && a==c){
            System.out.println("Triangle is a Equilateral triangle.");
        }
        else if((a==b && a!=c) || (b==c && b!=a)){
            System.out.println("Triangle is a Isosceles triangle.");
        }
        else{
            System.out.println("Triangle is a Scalene triangle.");
        }
    }
}
