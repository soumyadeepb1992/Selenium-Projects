package com.excelr.Google;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions = NumberFormatException.class )
	public void Test1() {
		String s = "100A";
		Integer.parseInt(s);
	}

}


