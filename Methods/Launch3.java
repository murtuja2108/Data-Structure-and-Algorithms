package Methods;

import java.util.Scanner;

class Calculator2{
    //Method with Parameters and a return value
    int res;
    int add(int x,int y){
        res=x+y;
        return res;
    }
}

public class Launch3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        System.out.print("Enter another number: ");
        int b=sc.nextInt();
        Calculator2 calc=new Calculator2();
        int sum=calc.add(a,b);
        System.out.println("Final result: "+sum);
    }
}
