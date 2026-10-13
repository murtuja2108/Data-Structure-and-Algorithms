package Methods;

import java.util.Scanner;

class Odd{
    public void oddNum(int x,int y){
        for(int i=x;i<=y;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

public class OddNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter last number: ");
        int b=sc.nextInt();
        Odd od=new Odd();
        od.oddNum(a,b);
    }
}
