package com.bridgelab.Algorithm;

import com.bridgelab.Utility.utility;

public class Mergesort 
{
public static void main(String[] args) 
{
	String[] array = { "rocky","dallas","dheera","dush","xiome"};

    String[] st = utility.mergeSort(array);
    for (int i = 0; i < st.length; i++)
    {
       System.out.print(st[i] + " ");
    }
}
}
