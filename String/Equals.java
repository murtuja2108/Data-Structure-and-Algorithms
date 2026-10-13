package Strings;

public class Equals {
    public static void main(String[] args) {
        String s="abcxyz";
        String a="abcxyz";
        String b=new String(s);
        String c="abc";
        c+="xyz";
        System.out.println(s==c);
        System.out.println(s.equals(c));
        System.out.println(s==a);
        System.out.println(s.equals(a));
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));//also this is valid
    }
}
