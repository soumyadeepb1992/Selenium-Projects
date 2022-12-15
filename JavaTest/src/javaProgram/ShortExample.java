package javaProgram;

public class ShortExample {
	public static void main(String[] args) 
	{
		short a;

		a = 10;
		System.out.println(a);
		a = 25;
		System.out.println(a);
		a =127;
		System.out.println(a);
		a = -128;
		System.out.println(a);
		a = 128;
		System.out.println(a);
		a = -129;
		System.out.println(a);
		a = -32768;
		System.out.println(a);
		a = 32767;
		System.out.println(a);

		//a = -32769; //ShortExample.java:24: error: incompatible types: possible lossy conversion from int to short
		//System.out.println(a);
		//a = 32768; //ShortExample.java:24: error: incompatible types: possible lossy conversion from int to short
		//System.out.println(a);

	}
}
