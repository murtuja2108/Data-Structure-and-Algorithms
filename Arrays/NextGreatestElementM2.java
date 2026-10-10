package Array1D;

import java.util.Scanner;

public class NextGreatestElementM2 {
    //Optimised Method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] brr=new int[n];
        brr[n-1]=-1;
        int nme=arr[n-1];
        for(int i=n-2;i>=0;i--){
            brr[i]=nme;
            nme=Math.max(nme,arr[i]);
        }
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}
