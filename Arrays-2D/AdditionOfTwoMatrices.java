package ArrayMultiD;

import java.util.Scanner;

public class AdditionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int n=sc.nextInt();
        System.out.println("Enter column size:");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int[][] brr=new int[n][m];
        System.out.println("Enter first matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter second matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                brr[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("First Matrix is:");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        System.out.println("Second matrix is:");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        int[][] crr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                crr[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println("Addition of two matrices is:");
        for(int[] ele:crr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
