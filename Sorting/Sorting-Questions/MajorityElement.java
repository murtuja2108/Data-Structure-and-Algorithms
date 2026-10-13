package Sorting_Basics;

import java.util.Scanner;

public class MajorityElement {
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
            int j=i+1;
            while(j>=0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }
        }
        int majorityElement=arr[arr.length/2];
        System.out.println("Majority Element is: "+majorityElement);
    }
}
