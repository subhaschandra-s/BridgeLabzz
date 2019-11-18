package com.bridgelab.basic;

import java.util.Scanner;

import com.bridgelab.Utility.utility;

public class Flipcion 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the no of times to flip a coin");
	  int times=sc.nextInt();
	 utility.flipPerc(times);
	}
}
