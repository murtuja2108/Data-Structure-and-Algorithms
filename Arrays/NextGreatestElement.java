package Array1D;

import java.util.Scanner;

public class NextGreatestElement {
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
        //This method is Bekar in the sence bohut time consuming
        for(int i=0;i<n-1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
            }
            brr[i]=max;
        }
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}
