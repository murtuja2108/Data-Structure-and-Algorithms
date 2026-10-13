package Strings.StringBuilders;

import java.util.Scanner;

public class AppendMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.append('a');
        System.out.println(sb);
        sb.append("abcd");
        //sb+="abc";//not possible
        System.out.println(sb);
    }
}
