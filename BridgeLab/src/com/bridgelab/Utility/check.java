package com.bridgelab.Utility;
import static org.junit.Assert.*;

import org.junit.Test;


public class check {

	@Test
	public void test() {
		assertEquals(utility.powerno(4),16);
	}
	@Test
  public void test1() {
	assertEquals(utility.dayofweek(19, 11, 2019),2);
	
}
	@Test
	public void test3()
	{
		int[] arr= {1,0,0,0,0,0,0,0,0};
		assertArrayEquals(utility.getNotes(1000),arr);
	}
}
