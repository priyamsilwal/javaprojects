package com.java.basics;

import java.util.Scanner;

class CalculateStringLength
{
	String str = null;

	public void FindLength()
	{
		Scanner wrd = new Scanner(System.in);
		System.out.println("Enter your data");
		String str = wrd.nextLine();

		int count=1;

		for (int i=0;i<str.length()-1;i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!= ' '))
			{
				count++;
			}
		}	
		System.out.println("The total words are " + count);
	}		
}
public class Assignment2 {

	public static void main(String[] args)
	{
		CalculateStringLength obj = new CalculateStringLength();
		obj.FindLength();
	}
}
