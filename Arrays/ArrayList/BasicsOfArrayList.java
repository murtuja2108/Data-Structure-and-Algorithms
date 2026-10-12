package Array1D.ArrayLists;

import java.util.ArrayList;

public class BasicsOfArrayList {
    public static void main(String[] args){
        //ArrayList<DataType>arrayVariableName=new ArrayList<>(capacityOfArrayList);
        ArrayList<Integer> arr=new ArrayList<>(6);//Declaration of arrayList
        //in parenthesis, if we do not declared capacity of arrayList then no error occur
        arr.add(0,10);//value initialize
        arr.add(1,20);//arr.add(index,value initialize);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);//printing o/p using builting fxn
        //manually printing o/p in below
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        /*
        if we do not initialize arrayList then no error occur but
        if we initialise one element after that we leave one blank space after that we are initialize
        another element then if we print,it show error because one middle element is does not exist
        */
    }
}
