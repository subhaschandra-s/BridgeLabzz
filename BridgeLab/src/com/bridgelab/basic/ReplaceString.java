package com.bridgelab.basic;

import java.util.Scanner;
import com.bridgelab.Utility.utility;

public class ReplaceString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the user name");
	String s=sc.nextLine();
    utility.replace(s);
	
}
}
