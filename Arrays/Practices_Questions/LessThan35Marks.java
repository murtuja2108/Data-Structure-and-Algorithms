package Array1D.PracticeQuestions;

import java.util.Scanner;

public class LessThan35Marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total number of Students: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" students marks individually:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<35){
                System.out.print("Roll of that student who got less than 35 number in the examination: "+i);
            }
        }
    }
}
