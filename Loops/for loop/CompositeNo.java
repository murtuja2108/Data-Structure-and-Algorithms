package Loops.For;

import java.util.Scanner;

public class CompositeNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                System.out.println(n+" is a Composite Number with minimum factor "+i+".");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println(n+" is not a composite number");
        }
    }
}
