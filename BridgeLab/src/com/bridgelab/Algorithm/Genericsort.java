package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Genericsort {
	public static void main(String[] args) {
		System.out.println("enter value of n");
		int n=utility.readInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the element");
			a[i]=utility.readingString();
			
		}
        utility.genericSort(a);
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        
	
}
}

	