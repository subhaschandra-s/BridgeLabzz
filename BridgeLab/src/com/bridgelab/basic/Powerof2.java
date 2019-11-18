package com.bridgelab.basic;

import java.util.Scanner;
import com.bridgelab.Utility.utility;

public class Powerof2 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the power no");
	int n=sc.nextInt();
	utility.powerno(n);
}
}
