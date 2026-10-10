package Array1D;

import java.util.Scanner;

public class SortTheArraysOf0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" input only 0's and 1's and 2's:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the array(Which is given by the user):");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] brr=new int[n];
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                brr[b]=arr[i];
                b++;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                brr[b]=arr[i];
                b++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                brr[b]=arr[i];
                b++;
            }
        }
        System.out.println("Sorted Array:");
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}
