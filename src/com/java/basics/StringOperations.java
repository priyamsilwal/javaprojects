//Find the length of 2 strings

package com.java.basics;
import java.util.Scanner;

public class StringOperations
{
	String a1 ;
	String b1 ;
	String c1 ;
	String result;
	
	public void wordsize()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the values");
	a1 = sc.nextLine();
	b1 = sc.nextLine();
	c1 = sc.nextLine();
	result = a1+b1+c1;
	System.out.println("The result of concatenation is " + result);
	}
	
	public void size()
	{
		int lenght1 = a1.length();
		int lenght2 = b1.length();
		int lenght3 = c1.length();
		
		System.out.println("Length of a string Length1 is " + lenght1);
		System.out.println("Length of a string Length2 is " + lenght2);
		System.out.println("Length of a string Length3 is " + lenght3);
	}
	public static void main(String[] args) {
		StringOperations obj = new StringOperations();
		obj.wordsize();
		obj.size();
	}

}
