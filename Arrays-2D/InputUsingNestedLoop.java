package ArrayMultiD;

import java.util.Scanner;

public class InputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Row number:");
        int n=sc.nextInt();
        System.out.println("Column number:");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter "+n*m+" elements:");
        //For Input
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //For output
        System.out.println("Two Dimensional array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
