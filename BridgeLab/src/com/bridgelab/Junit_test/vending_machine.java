package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;

public class vending_machine 
{
	public static void main(String[] args) 
	{	
    	System.out.println("Enter the Amount to be withdrawl");
		int totalAmount = utility.readInt();
		utility.getNotes(totalAmount);
	}
}
