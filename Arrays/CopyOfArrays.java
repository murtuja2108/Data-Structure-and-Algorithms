package Array1D;

public class CopyOfArrays {
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] num=arr;//Shallow Copy: means another name of arr
        System.out.print("Copied array of arr is: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        num[0]=20;
        System.out.print(arr[0]);
    }
}
