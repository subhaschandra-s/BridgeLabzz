package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Bubblesort 
{
public static void main(String[] args) 
{
	int[] arr = {64, 34, 25, 12, 22, 11, 90}; 
   arr= utility.bubble(arr); 
    System.out.println("Sorted array");
    for(int x : arr)
    {
    	System.out.print(x+" ");
    }
    
}
}
