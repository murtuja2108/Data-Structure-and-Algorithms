package Sorting_Basics;

import java.util.Scanner;

public class SelectionSort {
    //Sort Increasing Order Using Selection Sort but put min element is left position in each pass
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
        System.out.println("Enter arrat size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Input array is:");
        print(arr);
        //System.out.println();//separate user input and internal steps
        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex=j;
                }
            }
            //swap arr[i] and arr[mindex]
            swap(arr,i,mindex);
            //print(arr);//printing internal steps
            //System.out.println();//separate internal steps
        }
        System.out.println("Solved array is:");
        print(arr);
    }
}
