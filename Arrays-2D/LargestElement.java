package ArrayMultiD;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int n=sc.nextInt();
        System.out.println("Enter column size:");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("2D array is:");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //largest=Math.max(largest,,arr[i][j]);
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("Largest Element is: "+largest);
    }
}
