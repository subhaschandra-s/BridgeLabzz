package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Binarysearch 
{
public static void main(String[] args) 
{
	String find,file;
	
    System.out.println("enter the file name");
    file=utility.readString();
    System.out.println("enter the word to find");
    find=utility.readString();
    String s[]=utility.readfile(file).split(" ");
    utility.insertionSort(s);
    for(String f:s)
    	System.out.println(f);
  utility.binarysearch(s,find);
} 
}

