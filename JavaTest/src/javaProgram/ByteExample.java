package javaProgram;

public class ByteExample {
	public static void main(String[] args) 
	{
	byte a;
	
	a = 10;
	System.out.println(a);
	
	a = 25;
	System.out.println(a);
	
	a = 127;
	System.out.println(a);

	//a = 128;  --> Error
	
	a = 0;
	System.out.println(a);

	a = -126;
	System.out.println(a);

	a = -127;
	System.out.println(a);

	a = -128;
	System.out.println(a);

	//a = -129;  --> Error
 	
	}
}
