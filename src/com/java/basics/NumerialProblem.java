/*
 *Output of this program should be 
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 */
package com.java.basics;

public class NumerialProblem {

	public static void main(String[] args)
	{
		int i = 1;
		for(int j=1;j<=5;j++)
		{
			for(i=1;i<=5;i++)
			{
				System.out.print(i + " ");
			}		
			System.out.println("");
		}		
	}
}
