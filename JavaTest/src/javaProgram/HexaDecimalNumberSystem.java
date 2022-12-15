package javaProgram;

public class HexaDecimalNumberSystem {
	public static void main(String[] args) 
	{
		int a = 15; // This is not a HexaDecimal , it is a Decimal
		System.out.println(a);	
		
		int b = 0x10; 
		System.out.println(b);		      

		int c = 0X45; 
		System.out.println(c);	
		
		int d = 0x1234; 
		System.out.println(d);	

		int e = 0X45f68;  
		System.out.println(e);	

		int f = 0Xface;  
		System.out.println(f);
		
		// int g = 0Xbase;   [s is not a HexaDecimal number]
        
	}
}
