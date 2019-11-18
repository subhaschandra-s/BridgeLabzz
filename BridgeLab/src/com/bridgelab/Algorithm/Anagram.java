package com.bridgelab.Algorithm;

import java.util.Scanner;

import com.bridgelab.Utility.utility;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		boolean s3=utility.anagram(s1, s2);
		System.out.println(s3);
		
		
			}
}
