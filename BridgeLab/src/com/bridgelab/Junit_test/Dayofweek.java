package com.bridgelab.Junit_test;

import com.bridgelab.Utility.utility;
public class Dayofweek 
{
public static void main(String[] args) 
{
	System.out.println("enter the day, month, and year");
	int dd=utility.readInt();
	int mm=utility.readInt();
	int yy=utility.readInt();
	
	utility.dayofweek(dd,mm,yy);
}
}
