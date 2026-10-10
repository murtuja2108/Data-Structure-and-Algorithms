package Array1D;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.print("Enter array element: ");
        for(int i=0;i<=n-1;i++){
            x[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=n-1;i++){
            sum+=x[i];
        }
        System.out.print(sum);
    }
}
