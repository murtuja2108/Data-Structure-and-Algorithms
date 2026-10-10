package Array1D;

import java.util.Scanner;

public class MergeTwoSortedArrayInSortedOrder {
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
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==n1){
            while(j<n2){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        /*if(j==n2)*/
        else{
            while(i<n1){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        for(int ele:arr3){
            System.out.print(ele+" ");
        }
    }
}
