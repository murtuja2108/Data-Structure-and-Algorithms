package Array1D;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter terget sum: ");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println("Terget is found at is "+i+" and "+j);
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
    }
}
