package Array1D;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.print("Enter array element: ");
        for(int i=0;i<=n-1;i++){
            x[i]=sc.nextInt();
        }
        int max=x[0];
        for(int i=1;i<=n-1;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }
}
