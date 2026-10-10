package Array1D;

import java.util.Scanner;

public class ReverseArrayM2 {
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //Reversing
        int i=0;int j=n-1;//for full array reversing
        // int i=a;j=b;//for part of array reversing means sudhu majher kichu element reverse korar jonno we can use
        while(i<=j){
            /*
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            */
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println("Reversed array is:");
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
