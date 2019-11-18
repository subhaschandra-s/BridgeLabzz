package com.bridgelab.basic;

import java.util.Scanner;
import com.bridgelab.Utility.utility;

public class Harmonicno 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the nth harmonic no");
	int n=sc.nextInt();
	utility.harmonic(n);
}
}
