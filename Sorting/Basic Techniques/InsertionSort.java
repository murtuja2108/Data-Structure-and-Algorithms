package Sorting_Basics;

import java.util.Scanner;

public class InsertionSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    //print(arr);
                }
                else{
                    //print(arr);
                    break;
                }
            }
            //System.out.println();
        }
        System.out.println("Sorted array is:");
        print(arr);
    }
}
