package Conditionals;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year: ");
        int y=sc.nextInt();
        if(y%4==0){
            if(y%100==0 && y%400!=0){
                System.out.println(y+" is not a leap year.");
            }
            else{
                if(y%400==0){
                    System.out.println(y+" is a leap year.");
                }
                else{
                    System.out.println(y+" is a leap year.");
                }
            }
        }
        else{
            System.out.println(y+" is not a leap year.");
        }
    }
}
