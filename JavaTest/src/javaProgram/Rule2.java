package javaProgram;
//The only Special Characters that are allowed is $ and _

public class Rule2 {
	public static void main(String[] args) 
	{
		int ag_e = 26;
		int AGE$ = 25;
		int $Age = 24;
		int _aGe = 27;
		
		//int @aGe = 27;  --> Error

		System.out.println(ag_e);
		System.out.println(AGE$);
        System.out.println($Age);
        System.out.println(_aGe);
	}
}
