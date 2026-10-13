package Methods;

import java.util.Scanner;

class Calculator3{
    double res;
    public void root(int x){
        for(int i=1;i<=x;i++){
            res=Math.sqrt(i);
            System.out.println(res);
        }
    }
}

public class SquareRoot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n-th term: ");
        int n=sc.nextInt();
        Calculator3 calc=new Calculator3();
        calc.root(n);
    }
}
