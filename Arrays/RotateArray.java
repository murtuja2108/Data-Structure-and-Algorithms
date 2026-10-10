package Array1D;

import java.util.Scanner;

public class RotateArray {
    static void reverse(int[] arr,int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        //System.out.println("Enter "+n+" array elements:");
        int[] arr=new int[n];
        //int b=arr.length;
        for(int i=0;i<arr.length;i++){
            //arr[i]=sc.nextInt();
            arr[i] = 1 + (int) (Math.random()*100);
        }
        System.out.println("Printing the array:");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.println("Enter how many rotating you want:");
        int a=sc.nextInt();
        int k=a%n;
        reverse(arr,0,n-k-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr,n-k,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        reverse(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
