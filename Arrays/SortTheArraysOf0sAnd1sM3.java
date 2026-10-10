package Array1D;

import java.util.Scanner;

public class SortTheArraysOf0sAnd1sM3 {
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
        int k=0;
        int l= n-1;
        while(l>k){
            if(arr[k]==0){
                k++;
            }
            else if(arr[l]==1){
                l--;
            }
            else if(arr[k]==1 && arr[l]==0){
                arr[k]=0;
                arr[l]=1;
                k++;
                l--;
            }
        }
        System.out.println("Sorted Array:");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
