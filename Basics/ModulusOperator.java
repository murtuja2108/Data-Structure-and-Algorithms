package Basics;

public class ModulusOperator {
    public static void main(String[] args)
    {
        int x=8;
        int y=3;
        System.out.println(x%y);
        int a=2,b=22;
        System.out.println(a%b);
        int c=5,d=-2;
        System.out.println(c%d);
        int e=-18,f=5;
        System.out.println(e%f);
        int g=-20,h=-8;
        System.out.print(g%h);
    }
}
/*
1. x % y = x (if x<y)
2. x % (-y) = x % y
3. (-x) % y = -[x % y]
4. (-x) % (-y) = -[x % y]
*/