package Array1D.PracticeQuestions;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.print("Sum of "+n+" elements is: "+sum);
    }
}
