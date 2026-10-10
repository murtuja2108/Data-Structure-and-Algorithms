package Array1D.PracticeQuestions;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element which one you search : ");
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.print("The item is found in the index number "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.print("Item is not found.");
        }
    }
}
