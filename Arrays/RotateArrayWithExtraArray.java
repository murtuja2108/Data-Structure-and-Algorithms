package Array1D;

import java.util.Scanner;

public class RotateArrayWithExtraArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        //System.out.println("Enter " + n + " array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            //arr[i]=sc.nextInt();
            arr[i] = 1 + (int) (Math.random() * 100);
        }
        System.out.println("Printing the array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Enter how many rotating you want:");
        int k = sc.nextInt();
        k = k % n;
        int b=n-k;
        int[] brr=new int[n];
        for(int i=0;i<=k-1;i++){
            brr[i]=arr[b];
            b++;
        }
        int m=0;
        for(int i=k;i<=n-1;i++){
            brr[i]=arr[m];
            m++;
        }
        System.out.println("After Rotation,Arrays are:");
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}