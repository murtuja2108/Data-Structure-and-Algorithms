package Conditionals;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Cost price or MRP : ");
        int cp=sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp=sc.nextInt();
        if(cp<sp){
            System.out.println("The Seller has made profit.");
            int profit=sp-cp;
            System.out.println("Total profit made by the seller is "+profit+" rupees.");
        }else if(cp==sp){
            System.out.println("The seller has no profit no loss.");
        }else{
            System.out.println("The seller has incurred loss.");
            int loss=cp-sp;
            System.out.println("Total loss incurred by the seller is "+loss+" rupees.");
        }
    }
}
