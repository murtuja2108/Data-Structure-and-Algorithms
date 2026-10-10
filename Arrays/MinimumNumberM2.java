package Array1D;

import java.util.Scanner;

public class MinimumNumberM2 {public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n=sc.nextInt();
    int[] x=new int[n];
    System.out.print("Enter array element: ");
    for(int i=0;i<=n-1;i++){
        x[i]=sc.nextInt();
    }
    int min=Integer.MAX_VALUE;
    for(int i=0;i<=n-1;i++){
			/*if(x[i]>max){
				max=x[i];
			}*/
        min=Math.min(min,x[i]);
    }
    System.out.println("Minimum element is : "+min);
}

}
