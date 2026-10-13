package Sorting_Basics;

import java.util.Scanner;

public class BubbleSort{
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing array elements which is given by user:");
        print(arr);
        //System.out.println();//for separating user given input and internal steps
        for(int j=0;j<n-1;j++){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
                //print(arr);//for printing internal steps
            }
            //System.out.println();//for separating the internal steps wrt outer and inner loops
        }
        System.out.println("Sorted array:");
        print(arr);
    }
}
