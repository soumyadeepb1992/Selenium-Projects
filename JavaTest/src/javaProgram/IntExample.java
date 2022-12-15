package javaProgram;

public class IntExample {
	public static void main(String[] args) 
	{
		int a;
		a = 46;
		System.out.println(a);
		a = 10;
		System.out.println(a);

		a = -2147483648;
		System.out.println(a);
        a = 2147483647;
		System.out.println(a);
		
		//a = -2147483649; //IntExample.java:16: error: integer number too large: -2147483649
		
        //a = 2147483648; //IntExample.java:18: error: integer number too large: 2147483648
		
		//a = 10.3; //IntExample.java:20: error: incompatible types: possible lossy conversion from double to int
        
	}
}
