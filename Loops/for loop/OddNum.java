package Loops.For;

import java.util.Scanner;

public class OddNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number which is the last: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
