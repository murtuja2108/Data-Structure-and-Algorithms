package Methods;

import java.util.Scanner;

class Counter{
    //Method with no parameters but with a return value
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int res;
    int Add(){
        res=a+b;
        return res;
    }
}

public class Launch1 {
    public static void main(String[] args){
        Counter coun=new Counter();
        int sum=coun.Add();
        System.out.println("Final result: "+sum);
    }
}
