package Methods;

import java.util.Scanner;

class Calculator{
    //Method with no Parameters with no return value
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int res;
    void add(){
        //a=10;
        //b=20;
        res=a+b;
        System.out.println("Addition result of two given numbber is "+res);
    }
}

public class Launch {
    public static void main(String[] args){
        Calculator calc=new Calculator();
        calc.add();
    }
}
