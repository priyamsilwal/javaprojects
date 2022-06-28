//Dont have to handle the exception
//Dont have to convert the string into integer

package com.java.basics;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) 
	{
		int n = 0;
		System.out.println("Insert the value");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n);
	}
}
