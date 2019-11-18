package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Binarysearch 
{
public static void main(String[] args) 
{
	String[] arr = {"geeks", "contribute", "practice","ide"}; 
    String x = "practice"; 
    int result = utility.binarySearch(arr, x); 

    if (result == -1) 
        System.out.println("Element not present"); 
    else
        System.out.println("Element found in a list is-> " +x); 
} 
}

