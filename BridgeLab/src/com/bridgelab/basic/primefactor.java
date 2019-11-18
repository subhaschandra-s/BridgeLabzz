package com.bridgelab.basic;

import java.util.Scanner;
import com.bridgelab.Utility.utility;

public class primefactor
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no to find prime factors");
	int n=sc.nextInt();
	utility.primefact(n);
}
}
