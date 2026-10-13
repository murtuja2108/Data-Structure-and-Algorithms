package Loops.For;

import java.util.Scanner;

public class APseriesM1 {
    public static void main(String[] args){
        //Arithmetic Progression -> AP series
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n=sc.nextInt();
		/*for calculate the N-th term
		a,a+d,a+2d,....,a+(n-1)d
		formula=a+(n-1)d
		first term(a)=1
		common difference(d)=2
		Formula=2n-1
		*/
        for(int i=4;i<=3*n+1;i+=3){
            System.out.println(i);//4,7...
        }
    }
}
