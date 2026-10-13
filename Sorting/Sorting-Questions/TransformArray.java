package Sorting_Basics;

import java.util.Scanner;

public class TransformArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int mindex =-1;
            for(int j=0;j<n;j++){
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    mindex = j;
                }
            }
            arr[mindex]=m;
            m--;
        }
        for(int i=0;i<n;i++){
            arr[i]*=-1;
        }
        System.out.println("Array is:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
