package Array1D;

import java.util.Arrays;

public class CopyOfArrays2 {
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] brr= Arrays.copyOf(arr,arr.length);
        /*brr=Arrays.copyOf(arr,NewArraylength)*/
		/*
		Deep Copy:another copy of arr but in this array we can modify anything
		but arr array remain same
		*/
        System.out.print("Copied array of arr is: ");
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        brr[0]=90;
        System.out.println(arr[0]);
        System.out.println("brr 1st element is: "+brr[0]);
        System.out.print("After modify, Array is : ");
        for(int ele: brr){
            System.out.print(ele+" ");
        }
        /*
        another type of declaration of deep copy of array

        int[] crr=new int[arr.length];
        for(int i=0;i<crr.length;i++){
	        crr[i]=arr[i];
        }
        crr[0]=100;
        System.out.print(arr[0]);
        */
    }
}
