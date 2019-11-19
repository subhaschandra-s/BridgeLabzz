package com.bridgelab.Utility;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;

public class utility<T>
{
	  static Scanner sc ;
	static Random random;
	static
	{  
		sc= new Scanner(System.in);
		random = new Random();
	}
	public static void replace(String s) //accessing the string from main method
	{
		String x="hi username,  how r u";
		String v=x.replaceAll("username", s); //replacing with new name
		System.out.println(v);    				//replaced name
	}

	/*
	 flip coins program
	 */

	public static void flipPerc(int times)		//accessing the times to flip coin
	{
		double heads=0;
		for(int i=0;i<times;i++)
		{
			if(Math.random()> 0.5)
			{
				heads++;
			}
		}
		System.out.println("heads percentage is"+(double)(heads/times)*100); //heads percentage
		System.out.println("tails percentage is"+(double)(100-(heads/times)*100));  //tails percenatge
	}

	/*
	leap year program
	 */
	public static void leapyr(int n)
	{
		if(n>=1000 && n<=10000)
		{
		 if(n%400==0||n%4==0 && n%100!=0)	
			System.out.println(n+" is leap year");
			else
			
				System.out.println(n+" is not a leap year");
		}
		else
			System.out.println("enter valid year");
		
	}
	/*
	 nth power no program
	 */

	public static int powerno(int n)
	{
		int power=1;
		for(int i=1;i<=n;i++)
		{
			power=2*power;
		System.out.println(2+"^"+i+"=" +power);
	}
		return power;
	}


	/*
	 harmonic no program
	 */

	public static void harmonic(int n)
	{
		double sum=0.0;
		double s=0;
		
		for(int i=1;i<=n;i++)
		{
			sum =1.0/i;
			System.out.println(" harmonic values is "+sum);
		
		 s= sum+s;
			}
		System.out.println("total "+s);
		
	}
	
	/*
	 prime factors
	 */
	public static void primefact(int n)
	{
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
	}
	
}
	public static int  readInt()
	{
		return sc.nextInt();
	}
	
	public static double readDouble()
	{
		return sc.nextDouble();
	}
	
	public static String readString()
	{
		return sc.nextLine();
	}
	public static String readingString()
	{
		return sc.next();
	}
	
	/*
	 for input random value
	 */
	public static int inputRandom(int size)
	{
		try 
		{
			return sc.nextInt();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
		return 0;
	}
	
public static int[][] readTwoDimensionArray(int m,int n)
{
	int [][] mat=new int[m][n];
	System.out.println("enter 6 values");
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			mat[i][j]=readInt();
		}
	}
	return mat;
}
	
public static void dsiplayMatrix(int[][]mat)
{
	System.out.println("printing array value");
	PrintWriter pw=new PrintWriter(System.out);
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			pw.print(mat[i][j]+" ");
			pw.flush();
		}
		pw.println();
	}
}

/* Finding the triplets in an array whose sum is 0
* 
* ... array
* @return total number of triplets
*/
public static int triplets(int[] array) 
{
	int count = 0;
	for (int k = 0; k < array.length; k++) 
	{
		for (int j = k + 1; j < array.length; j++)
		{
			for (int i = j + 1; i < array.length; i++)
			{
				if (array[k] + array[j] + array[i] == 0) 
				{
					count++;
					System.out.println(array[k] + " " + array[j] + " " + array[i]);
				}
			}
		}
	}
	return count;
}

public static void quadratic(double a,double b,double c)
{
	double delta=(b*b-4*a*c);
	if(delta<0)
	{
	System.out.println("take one value  negative imaginary");
	}

	else
	{
	double x=(-b + Math.sqrt(delta))/(2*a);
	double y=(-b -Math.sqrt(delta))/(2*a);
	System.out.println("x=" +x);
	System.out.println("y=" +y);
	}
	
}	
/*
 to coupon numbers....

 */
// return a random coupon between 0 and n-1
public static int getCoupon(int n) 
{
    return (int) (Math.random() * n);
}

// return number of cards you collect before obtaining one of each of the n types
public static int collect(int n) 
{
    boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
    int count = 0;                           // number of cards collected
    int distinct  = 0;                       // number of distinct card types collected

    // repeat until you've collected all n card types
    while (distinct < n) {
        int value = getCoupon(n);            // pick a random card 
        count++;                             // one more card
        if (!isCollected[value]) {           // discovered a new card type
            distinct++;
            isCollected[value] = true;
        }
    }
    return count;
}

/*
 * Finding minimum number of notes coming out for a fulfilling a particular
 * amount.
 * 
 * @... amount
 */
public static int[] getNotes(int amount) {
	int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
	int[] notesCount = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	for (int i = 0; i < notes.length; i++) {
		if (amount >= notes[i]) {
			notesCount[i] = amount / notes[i];
			amount = amount % notes[i];
		}
	}
	return notesCount;
	
}

/*
 @get the day of week 
 * 
 */

public static int dayofweek(int dd,int mm,int yy)  //accessing date month year
{
	int y=yy-(14-mm)/12;					//for year
	int x=y+y/4-y/100+y/400;  				//checks for leap year
	int m=mm+12*((14-mm)/12)-2;				// for months...
	int d=(dd+x+((31*m)/12))% 7;		    //gets a date here
	String a[]= {"sunday","monday","tuesday","wednesday","tursday","friday","saturday"};
	System.out.println(a[d]);
	String b[]= {"0","jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
	System.out.println("month--- "+b[mm]);
	
	return d;
}
/*
 @get the celsius value using formula....
 * 
 */

public static void getcelsius(double f)
{
	double c=(f-32)*5/9;   			//Fahrenheit to Celsius...
	//double f=(c*9/5)+32;			//Celsius to Fahrenheit...
	System.out.println(" celsius value is "+c);
}
/*
 @get monthly payment..
 */
public static void getmonthpayment(int P,int Y,double R)
{
	int n=12*Y;
    double r=R/(12*100);
    
    double payment=P*r/(1-Math.pow(1+r, -n));
    System.out.println("monthly payment is-->"+payment);
	
}
/*
 @ get square rot value..
 */
public static void getsqrt(double c)
{
	double t=c;
	double epsilon=1.0e-15;
	while((Math.abs(t-c/t))>epsilon*t)
	{
		t=(c/t+t)/2.0;	
	}
		System.out.println(t);
}
/*
 @ get the binary numbers ...from decimal value..
 */
public static String tobinaryString(int n)
{
	String bin="";
	while(n>0)
	{
		int r=n%2;
		bin=r+bin;
		n=n/2;
	}
	return bin;
}
/*
 *@swap Nibbles...
 */
public static String swapNibble(String s) 
{
	char[] c = s.toCharArray();
	String swapedNibbles = "";
	if (c.length < 8) 
	{
		int count = 8 - c.length;
		while (count > 0)
		{
			swapedNibbles += "0";		//adding 0 to first of the bit..
			count--;
		}
		
	}
	
	for (int i = 0; i < c.length; i++)
	{
		swapedNibbles += c[i];
	}
	System.out.println(swapedNibbles); //swapped values...
	c = swapedNibbles.toCharArray();
	
	swapedNibbles = "";
	System.out.println(swapedNibbles);
	
	for (int i = c.length / 2; i < c.length; i++)
	{

		swapedNibbles = swapedNibbles + c[i];
	}
	System.out.println(swapedNibbles);  	//swapped nibble after the 1st4 bits
	
	for (int i = 0; i < (c.length / 2); i++)
	{
		swapedNibbles = swapedNibbles + c[i];
	}
	return swapedNibbles;
}

public static int binaryToDecimal(String x) 	//binary to decimal value...
{
	int sum = 0, p = 0;  
	for (int i = x.length() - 1; i >= 0; i--)
	{

		if (x.charAt(i) == '1')
		{
			sum = (int) (sum + Math.pow(2, p));
		}
		p++;
	}
	return sum;
}
/*
 @ Check Arrays returned String functions are equal..
 */
public static void getArrayequal(String str1, String str2)
{
	 char[] arr1 = str1.toCharArray();
	 char[] arr2 = str2.toCharArray();
	 
	 int a = 0;
	 for(int i=0; i<arr1.length; i++)
	 {
		 if(arr1[i] == arr2[i])
		 {
			 continue;
		 }
		 else
		 {
			 a++;
		 }
	 }
	 if(a>0)
	 {
		 System.out.println("Arrays are  not equals");
	 }
	 else
	 {
		 System.out.println("Arrays are equals"); 
	 }
}
/*
 @..binary search...
 ........
 */
//public static int binarySearch(String[] arr, String x) 
//{ 
//	Arrays.sort(arr);
//    int l = 0, r = arr.length - 1; 
//    while (l <= r)
//    { 
//        int m = (l+ r) / 2; 
//        int res = x.compareTo(arr[m]); 
//        if (res == 0) 
//        {
//            return m; 
//        }
//        else if (res > 0) 
//        {	
//            l = m + 1; 
//        }
//        else
//        {
//            r = m - 1; 
//        }
//    } 
//
//    return -1; 
//} 

/*
 * Generic Insertion Sort algorithm
 * 
 * @.... array
 * @return Sorting of String array via Insertion sort.
 */
public static String []insertionSort(String s[])
{
	for(int i=1;i<s.length;i++)
	{
		int j=i-1;
		String x=s[i];
		while(j>=0 && (s[j].compareTo(x)>0))
		{
			s[j+1]=s[j];
			j--;
		}
		s[j+1]=x;
	}
	return s;
}
/*
 Bubble sort..
 @return the sorted integer numbers..
 */
 public static  int[] bubble(int arr[]) 
{ 
    int n = arr.length; 
    for (int i = 0; i < n-1; i++) 
    {
        for (int j = 0; j < n-i-1; j++) 
        {
            if (arr[j] > arr[j+1]) 
            {  
                int temp = arr[j]; 
                arr[j] = arr[j+1]; 
                arr[j+1] = temp; 
            } 
        }
    }
	return arr;  
}
 /*
  Merge sort for string...
  */
 public static String[] mergeSort(String[] array)	//accessing the arrays..
 {
     String [] sorted = new String[array.length];
     if (array.length == 1)
     {
         sorted = array;
     } 
     else
     {
         int mid = array.length/2;
         String[] left = null; 
         String[] right = null;
         if ((array.length % 2) == 0)
         {
             left = new String[array.length/2];
             right = new String[array.length/2];
         }
         else 
         { 
             left = new String[array.length/2];
             right = new String[(array.length/2)+1];
         }
         int x=0;
         int y=0;
         for ( ; x < mid; x++)
         {
             left[x] = array[x];
         }
         for ( ; x < array.length; x++)
         {
             right[y++] = array[x];
         }
         left = mergeSort(left);
         right = mergeSort(right);
         sorted = mergeArray(left,right);
     }

     return sorted;
 }
/*
merging array....
 */
 private static String[] mergeArray(String[] left, String[] right)
 {
     String[] merged = new String[left.length+right.length];
     int lIndex = 0;
     int rIndex = 0;
     int mIndex = 0;
     int comp = 0;
     while (lIndex < left.length || rIndex < right.length)
     {
         if (lIndex == left.length)
         {
             merged[mIndex++] = right[rIndex++];
         } else if (rIndex == right.length) 
         {
             merged[mIndex++] = left[lIndex++];
         } 
         else
         {  
             comp = left[lIndex].compareTo(right[rIndex]);
             if (comp > 0) {
                 merged[mIndex++] = right[rIndex++];
             } else if (comp < 0) {
                 merged[mIndex++] = left[lIndex++];
             } else { 
                 merged[mIndex++] = left[lIndex++];
             }
         }   
     }
     return merged;  
 }
/*
@ two Strings are anagram...
 */
 public static boolean  anagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
		return true;
		
		}
		else
		{
			return false;
		}
	}
 /*
  @Generic method to called...
  */
 public static <T extends Comparable<T>> T[] genericSort(T[] a)
 {
	 for(int i=0;i<a.length-1;i++)
	 {
		 for(int j=0;j<a.length-i-1;j++)
		 {
			 if(a[j].compareTo(a[j+1])>0)
			 {
				 T temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
						 
			}
		 }
	 }
	 return a;
	 
 }
 /*
  @get prime numbers..
  */
 public static boolean getprimeno(int n)
 {
	 for(int i=1;i<n;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
				 break;
				}
			}
			if(isPrime)
				System.out.println(i+"--->prime number");
		}
	return false;
 }
 /*
   * Finding if a number is Palindrome or not
	 * 
	 * @... number
	 * @return true if Palindrome or else false
	 */
	public static void primePalindrome() {
		System.out.println();
		boolean b;
		for(int j=2;j<=1000;j++) {
			b=true;
			for(int i=2;i<j/2;i++) {
				if(j%i==0) {
					b=false;
					break;
				}
			}
			  if(b && ispalindrome(j))
				  System.out.println(j + " primepalindrome ");
		}
	}
	
	public static boolean ispalindrome(int j) 
	{
		int   sum =0 ,e =j;
		while(j!=0) {
			int r = j%10;
			sum = (sum*10 ) +r;
			j=j/10;
		}
	if(sum ==e) {
		return true;
	}
	return false;
	}

/*
	 Function to check if no is anagram or not
	 */
  public static void primeanagram() {
	  ArrayList<Integer> ar=new ArrayList<Integer>();
	  boolean b;
	  for(int j=2;j<=1000;j++)
	  {
		  b=true;
		  for(int i=2;i<j/2;i++)
		  {
			  if(j%i==0) {
			  b=false;
			  break;
		  }
		  }
	  if(b)
		  ar.add(j);
	 
  }
for(int i=0;i<ar.size()-1;i++) {
	for(int j=i+1;j<ar.size();j++) {
		if(anagram(ar.get(i),ar.get(j)))
		{
			System.out.println(ar.get(i)+ " "+ar.get(j) + " primeanagram numbers");
		}
	}
}
}
  /*
   to check the values are anagram or not
   */
  public static boolean anagram(int n1,int n2)
  {
	  int[] n1count=count(n1);
	  int[] n2count=count(n2);
	  for(int i=0;i<n2count.length;i++) {
		  if(n1count[i]!=n2count[i]) {
			  return false;
		  }
	  }
	  return true;
  }
  /*
   function to count the numbers
   */
  public static int[] count(int n) {
	  int[] count=new int[10];
	  int temp=n;
	  while(temp!=0) {
	  int r=temp%10;
	  count[r]++;
	  temp=temp/10;
	
	  }
	  return count;
  }
  
 /*
  Function to do the binary search the word..
  */
  public static  void binarysearch(String[] Sorted_arr,String find)
  {
          int mid=0;
          int low=0;
          int high=Sorted_arr.length-1;
          while(high>=low)
          {
                  mid=(low+high)/2;

                  if(Sorted_arr[mid].equals(find))
                  {
                          System.out.println("the word->"+find+" is found");
                  break;
                  }
                  else if(Sorted_arr[mid].compareTo(find)<0)
                  {
                          low=mid+1;
                  }
                  else if(Sorted_arr[mid].compareTo(find)>0)
                          high=mid-1;
          }
          if(high<low)
                  System.out.println("the word->"+find+" is not found");

  }
  /*
   function to read the file...
   */
  public static String readfile(String file)
  {
  String str="";
  try
  {
  FileInputStream fir=new FileInputStream(file);
     DataInputStream dis=new DataInputStream(fir);
     str=dis.readLine();
     dis.close();
     fir.close();
  }
  catch(Exception e)
  {
  System.out.println(e);
     }
  System.out.println(str);
  return str;

  }
  /*
   finding the number 
   @return low
   */
  public static int find() {
	  int low=0, high=130,mid;
	  while(low!=high) {
		  mid=(low+high)/2;
		  System.out.println("enter 1 if no is between "+ low +"-"+ mid +"\n enter 2 if no is between "+ (mid+1) +"-"+ high);
		  int c=utility.readInt();
	mid=(low+high)/2;
	if(c==1)
		high=mid;
	else
		low=mid+1;
	  }
	return high;
	  
  }
}




