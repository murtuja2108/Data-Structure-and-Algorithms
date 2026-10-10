package Basics;

public class DoubleDataType {
    public static void main(String[] args) {
        double d=3.141;//By defaulf every floating point value is considered as double type
        System.out.println(d);
        float f=3.141f;
        System.out.println(f);
        int x=10;
        System.out.println(x+f+d);
		/*
		int + int = int
		int + float = float
		int + double = double
		float + double = double
		double + double = double*/
    }
}
