package Sorting_Basics;
import java.util.Scanner;
public class ArraySortedOrNot {
    public static boolean isSorting(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if (arr[i] > arr[i + 1]) {
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
        boolean flag=ArraySortedOrNot.isSorting(arr,n);
        if(!flag){
            System.out.println("Array is not sorted.");
        }
        else{
            System.out.println("Array is sorted.");
        }
    }
}
