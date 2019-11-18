package com.bridgelab.basic;

import java.util.Scanner;
import com.bridgelab.Utility.utility;

public class leapyear 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int n=sc.nextInt();
	utility.leapyr(n);
}
}
