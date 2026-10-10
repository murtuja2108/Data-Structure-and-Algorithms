package Array1D;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array element which you want to search in this array : ");
        int x=sc.nextInt();
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter array element: ");
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        int position=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                flag=true;
                position=i;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element is found in this array in "+position+"th index position.");
        }
        else{
            System.out.println("Element is not found in the given array.");
        }
    }
}
