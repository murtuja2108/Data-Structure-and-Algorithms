package Array1D;

import java.util.Arrays;

public class BuiltInMethods {
    public static void main(String[] args){
        int[] arr={20,10,30,47,27};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
