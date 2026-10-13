package Patterns.Specials;

import java.util.Scanner;

public class StarTriangleReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of column: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){//This condition is only valid for * triangle reverse
                System.out.print("* ");
            }
            System.out.println();
        }
        //Below condition is alwayas valid
		/*j=1;j<=n+1-i;j++
		i+j(max)=n+1
		j(max)=n+1-i
		*/
    }
}
