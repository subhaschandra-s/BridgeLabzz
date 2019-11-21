/**
 Author:Subhas
 purpose:function to check the leap year
 version:1.2
 Filename:leapyear
 Date:19/11/19
 */
package com.bridgelab.basic;

import com.bridgelab.Utility.utility;

public class leapyear 
{
public static void main(String[] args) 
{	
	System.out.println("enter the year");
	int n=utility.readInt();
	utility.leapyr(n);
}
}
