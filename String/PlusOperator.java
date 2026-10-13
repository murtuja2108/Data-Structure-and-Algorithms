package Strings;

public class PlusOperator {
    public static void main(String[] args) {
        String s="abc";
        String b="xyz";
        s=s+b;
        b+=s;
        System.out.println(s);
        System.out.println(b);
    }
}
