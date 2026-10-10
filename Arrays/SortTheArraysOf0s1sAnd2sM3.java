package Array1D;

import java.util.Scanner;

public class SortTheArraysOf0s1sAnd2sM3 {
    //Dutch flag Algorithm
    //Two Pass Method
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
        int noOfZeros=0;
        int noOfOnes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                noOfZeros++;
            }
            else if(arr[i]==1){
                noOfOnes++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<noOfZeros){
                arr[i]=0;
            }
            else if(i<noOfZeros + noOfOnes){
                arr[i]=1;
            }
            else {
                arr[i] = 2;
            }
        }
        System.out.println("Sorted Array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
