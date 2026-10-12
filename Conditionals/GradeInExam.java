package Conditionals;

import java.util.Scanner;

public class GradeInExam {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Marks in percentage: ");
        double n=sc.nextDouble();
        if(n>=91 && n<=100){
            System.out.println("Outstanding");
        }
        else if(n>=81){
            System.out.println("Excellent");
        }
        else if(n>=71){
            System.out.println("Very Good");
        }
        else if(n>=61){
            System.out.println("Good");
        }
        else if(n>=51){
            System.out.println("Average");
        }
        else if(n>=40){
            System.out.println("Below Average");
        }else{
            System.out.println("Fail");
        }
    }
}
