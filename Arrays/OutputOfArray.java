package Array1D;

import java.util.Scanner;

public class OutputOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        System.out.print("Enter array elements: ");
        for(i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("After initialization,the final array is : ");
        for(int j=0;j<=n-1;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
