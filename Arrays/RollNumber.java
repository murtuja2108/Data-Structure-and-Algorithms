package Array1D;

import java.util.Scanner;

public class RollNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array element: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n-1;i++){
            if(arr[i]<35){
                System.out.print("Roll: "+i+" ");
            }
        }
    }
}
