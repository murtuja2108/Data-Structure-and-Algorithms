package Array1D.ArrayLists;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println(arr+" "+arr.size());
        arr.add(10);
        System.out.println(arr+" "+arr.size());
        arr.add(20);
        System.out.println(arr+" "+arr.size());
        arr.add(30);
        System.out.println(arr+" "+arr.size());
        arr.remove(1);//arr.remove(Index number)
        System.out.println(arr+" "+arr.size());
        //index 1 becomes 30 so modify 30 and becomes 40
        arr.set(1,40);
        System.out.println(arr+" "+arr.size());
    }
}
