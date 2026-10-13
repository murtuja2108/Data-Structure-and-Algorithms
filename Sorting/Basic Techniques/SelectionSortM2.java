package Sorting_Basics;

import java.util.Scanner;

public class SelectionSortM2 {
    //Sort Increasing Order Using Selection Sort but put max element is right position in each pass
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
        System.out.println("User defined array is:");
        print(arr);
        //System.out.println("==============");
        int k=n-1;
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            int maxdex=-1;
            for(int j=0;j<n-i;j++){
                if(arr[j]>max){
                    max=arr[j];
                    maxdex=j;
                }
            }
            swap(arr,k,maxdex);
            k--;
//            print(arr);
//            System.out.println();
        }
        System.out.println("Sorted array is:");
        print(arr);
    }
}
