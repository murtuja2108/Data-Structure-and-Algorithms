package Methods;

import java.util.Scanner;

class Calculator1{
    //Method with Parameters and no return value
    int res;
    void add(int x,int y){
        res=x+y;
        System.out.println("Final result: "+res);
    }
}

public class Launch2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        Calculator1 calc=new Calculator1();
        calc.add(a,b);
    }
}
