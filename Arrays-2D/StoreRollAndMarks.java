package ArrayMultiD;

import java.util.Scanner;

public class StoreRollAndMarks {
    //Using Side by Side Matrix
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();
        System.out.println("How many data store:");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter Roll and Marks side by side:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //Output
        System.out.println("Roll and Marks:");
        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
