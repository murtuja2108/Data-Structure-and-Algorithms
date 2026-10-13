package Strings;

public class Concat {
    public static void main(String[] args) {
        String a="abc";
        String b="vab";
        System.out.println(a.concat(b));
        //we can store in another variable or char in same variable
        String s="abc";
        s=s.concat("xyz");
        System.out.println(s);
    }
}
