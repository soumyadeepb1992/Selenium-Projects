package com.excelr.Google;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	@Test(invocationCount = 3)
	public void add() {
		int sum = sum(10,20);
		System.out.println("The sum is "+ sum);
	}

}
