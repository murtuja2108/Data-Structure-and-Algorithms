package Array1D.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MovingZeroesAtEnd {
    public static void moveZeroes(int[] nums){
        ArrayList<Integer> arr=new ArrayList<>();
        int noOfZeros=0;
        for(int ele: nums){
            if(ele!=0){
                arr.add(ele);
            }
            else{
                noOfZeros++;
            }
        }
        for(int i=0;i<noOfZeros;i++){
            arr.add(0);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr.get(i);
        }
        System.out.println("Solved array is:");
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        moveZeroes(arr);
    }
}
