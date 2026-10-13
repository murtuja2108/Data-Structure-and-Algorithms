package Strings;

public class CompareTo {
    public static void main(String[] args) {
        String a="abc";
        String b="dbc";
        System.out.println(a.compareTo(b));
        /*
        compareTo working principle
        start compare first two letter of that string
        if any difference is present then subtraction is happened b/w that two chartecter
        a.charAt(0)-b.charAt(0);
        97-10=-3
        then the subtraction is happened b/w their ascii value
         */
        /*
        if both are same then only zero is then result
        if first string have maximum length then 1+1+1 adding
        a="abcddd";
        b="abc";
        o/p=3
         */
    }
}
