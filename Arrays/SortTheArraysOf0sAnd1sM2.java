package Array1D;

import java.util.Scanner;

public class SortTheArraysOf0sAnd1sM2 {
    //Two pass Solution
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" input only 0's and 1's:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing the array(Which is given by the user):");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int noOfZeros=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<noOfZeros){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        System.out.println("Sorted Array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
