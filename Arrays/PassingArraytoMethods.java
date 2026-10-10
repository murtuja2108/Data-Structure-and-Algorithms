package Array1D;

public class PassingArraytoMethods {
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }//in java,except array in this type of case like integer is called pass by value
    public static void change(int[] x){//here x is a reference of arr
        x[0]=90;//In java this is called pass by reference
    }
    /*
    When you pass an Array as an argument to a method,what actually gets passed?
    -> In java,Reference variable gets passed (Address of an Array)
    */
}
