package Array1D;

import java.util.Scanner;

public class SortTheArraysOf0s1sAnd2sM4 {
    //Dutch flag Algorithm
    //One Pass Method
    public static void swap(int[] arr,int n1,int n2){
        int temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
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
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
//                int temp=arr[mid];
//                arr[mid]=arr[low];
//                arr[low]=temp;
                swap(arr,mid,low);//swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
//                int temp=arr[mid];
//                arr[mid]=arr[high];
//                arr[high]=temp;
                swap(arr,mid,high);
                high--;
            }
        }
        System.out.println("Sorted Array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
