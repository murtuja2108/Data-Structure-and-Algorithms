package Sorting_Basics;

import java.util.Scanner;

public class SortDecreasingOrderUsingBubbleSort {
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
    public static boolean isSortInDecreasingOrder(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
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
        System.out.println("User defined array is:");
        print(arr);
        for(int i=0;i<n-1;i++){
            boolean flag=true;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    flag=isSortInDecreasingOrder(arr);
                }
            }
            if(flag){
                break;
            }
        }
        System.out.println("Sorted array in decreasing order is:");
        print(arr);
    }
}
