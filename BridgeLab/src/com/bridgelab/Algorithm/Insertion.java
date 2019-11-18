package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Insertion 
{
public static void main(String[] args) 
{
	System.out.println("Enter the size ");
	int n = utility.readInt();
	String[] s = new String[n];
	System.out.println("Enter " + n + " Strings");
	for (int i = 0; i < n; i++) {
		s[i] = utility.readingString();
	}
	s = utility.insertionSort(s);
	for(String st:s)
		System.out.print(st);
}
}

