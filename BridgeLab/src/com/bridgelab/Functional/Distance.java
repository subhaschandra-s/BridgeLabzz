package com.bridgelab.Functional;

import com.bridgelab.Utility.utility;

public class Distance 
{
public static void main(String[] args) 
{
	System.out.println("enter the x value");
	int x=utility.readInt();
	System.out.println("enter the y value");
	 int y=utility.readInt();
	double distance=(Math.sqrt(x*x+y*y));
	System.out.println(distance+" ");
}
}

