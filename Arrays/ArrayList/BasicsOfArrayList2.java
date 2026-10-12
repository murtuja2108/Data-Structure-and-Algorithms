package Array1D.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicsOfArrayList2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter arrayList size: ");
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>(n);
        System.out.println("Enter ArrayList element: ");
        for(int i=0;i<=n-1;i++){
            arr.add(i,sc.nextInt());
        }
        System.out.println("ArrayList size: "+arr.size());
        //System.out.println(arr);//printing o/p using builting fxn
        System.out.print("ArrayList is : ");
        for(int i=0;i<=n-1;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        arr.set(0,90);//set is use for modify the element of ArrayList element
        System.out.println("After modify :"+arr);
        arr.add(100);//push back
        System.out.println("ArrayList size after push: "+arr.size());
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
