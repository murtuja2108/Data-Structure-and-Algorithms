package Array1D;

public class OneLineInitialization {
    public static void main(String[] args)
    {
        int[] arr={10,20,30,40,50};
        System.out.println("Array length is : "+arr.length);
        System.out.print("Enter array element: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
