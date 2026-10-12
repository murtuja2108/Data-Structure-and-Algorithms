package Conditionals;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num=sc.nextInt();
        int count=0;
        int sum=0;
        int t=num;
        int a;
        while(t != 0){
            t=t/10;
            count++;
        }
        t=num;
        while(t != 0){
            a=t%10;
            int power=1;
            for(int i=0;i<count;i++){
                power*=a;
            }
            sum+=power;
            t/=10;
        }
        if(sum==num){
            System.out.println(num+" is a armstrong number.");
        }
        else{
            System.out.println(num+" is not a armstrong number.");
        }
    }
}
