package com.bridgelab.Datastructure;

import com.bridgelab.Datastructure.Base.Linkedlist;
import com.bridgelab.Utility.utility;

public class UnOrderedList <T>
{
public static void main(String[] args)
{
	Linkedlist al=new Linkedlist();
	System.out.println("enter the file name");
	String file=utility.readString();
	utility.readfile(file).split(" ");
	
}
}
