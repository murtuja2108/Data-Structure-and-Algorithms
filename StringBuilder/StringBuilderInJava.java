package Strings.StringBuilders;

public class StringBuilderInJava {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);
        System.out.println(sb.length());
        StringBuilder s=new StringBuilder();//Empty stringBuilder
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.capacity());//by default capacity of any string builder
        StringBuilder ss=new StringBuilder(10);//also we can assign capacity
        System.out.println(ss.capacity());
        System.out.println(ss.length());
    }
}
