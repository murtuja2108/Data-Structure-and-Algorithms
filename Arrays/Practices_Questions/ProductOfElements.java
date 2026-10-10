package Array1D.PracticeQuestions;

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int product=1;
        for(int i=0;i<arr.length;i++){
            product *=arr[i];
        }
        System.out.print("Product of "+n+" elements is : "+product);
    }
}
