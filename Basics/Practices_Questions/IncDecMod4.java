package Basics.PracticeQuestions;

public class IncDecMod4 {
    public static void main(String[] args){
        int a=10;
        System.out.println("Original value: "+a);
        int b=a++;
        System.out.println("After Increment: "+b);
        int c=a--;
        System.out.println("After Decrement: "+c);
        int d=c%b;
        System.out.println("Division: "+d);
    }
}
