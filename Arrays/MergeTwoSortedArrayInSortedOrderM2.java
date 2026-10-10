package Array1D;

import java.util.Scanner;

public class MergeTwoSortedArrayInSortedOrderM2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first array size:");
        int n1 =sc.nextInt();
        int[] arr1=new int[n1];
        System.out.println("Enter "+ n1 +" elements in first given array:");
        for(int i = 0; i< n1; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Second array size:");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];
        System.out.println("Enter "+ n2 +" elements in first given array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n1+n2];
        int i=n1-1;
        int j=n2-1;
        int k=arr3.length-1;
        while(i>=0 && j>=0){
            if(arr1[i]>=arr2[j]){
                arr3[k]=arr1[i];
                i--;
            }
            else{
                arr3[k]=arr2[j];
                j--;
            }
            k--;
        }
        if(i<0){
            while(j>=0){
                arr3[k]=arr2[j];
                j--;
                k--;
            }
        }
        /*if(j==n2)*/
        else{
            while(i>=0){
                arr3[k]=arr1[i];
                i--;
                k--;
            }
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
    }
}
