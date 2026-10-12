package Conditionals;

import java.util.Scanner;

public class OriginOrNot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter x-axis position: ");
        int x=sc.nextInt();
        System.out.print("Enter y-axis position: ");
        int y=sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Point is lies in the origin and position is (0,0).");
        }
        else if ((x>0 || x<0) && y==0){
            System.out.println("Point is lies in the x-axis and position is ("+x+",0).");
        }
        else if (x==0 && (y>0 || y<0)){
            System.out.println("Point is lies in the y-axis and position is (0,"+y+").");
        }
        else if (x>0 && y>0){
            System.out.println("Point is lies in the 1st Quadrant and position is ("+x+","+y+").");
        }
        else if (x<0 && y>0){
            System.out.println("Point is lies in the 2nd Quadrant and the position is ("+x+","+y+").");
        }
        else if (x<0 && y<0){
            System.out.println("Point is lies in the 3rd Quadrant and position is ("+x+","+y+").");
        }
        else
            System.out.println("Point is lies in the 4th Quadrant and position is ("+x+","+y+").");
    }
}
