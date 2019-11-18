package com.bridgelab.Logical;

import com.bridgelab.Utility.utility;

public class Coupon 
{
public static void main(String[] args) 
{
	System.out.println("enter the n value");
	int n = utility.readInt();
    int count = utility.collect(n);
    System.out.println("Numbers of cards collected for random value "+count);

}

}
