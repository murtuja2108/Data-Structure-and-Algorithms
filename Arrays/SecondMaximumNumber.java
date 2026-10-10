package Array1D;

import java.util.Scanner;

public class SecondMaximumNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.print("Enter array element: ");
        for(int i=0;i<=n-1;i++){
            x[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<=n-1;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        for(int i=0;i<=n-1;i++){
            if(x[i]<max && x[i]>secondMax){
                secondMax=x[i];
            }
        }
        System.out.println("Second maximum element is : "+secondMax);
    }
}
