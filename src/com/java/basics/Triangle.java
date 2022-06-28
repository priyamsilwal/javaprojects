package com.java.basics;
import java.util.Scanner;

public class Triangle
{
	double a = 0; // variable should accept +/- 0.000001
	double b = 0;
	double c = 0;
	public void triangle()
	{
		System.out.println("Insert the values of a b and c");
		Scanner sc = new Scanner(System.in); // input values 
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		System.out.println("Value of a is " + a);
		System.out.println("Value of b is " + b);
		System.out.println("Value of c is " + c);
	}
	public void TraingleType()
	{
		try  // check if no exception is thrown
		{
			if ((a+b > c) || (a+c > b) || (b+c> a)) // condition for valid triangle
			{
				System.out.println("Its a triangle");
				
				if (((a*a)+(b*b)==(c*c))||((a*a)+(c*c)==(b*b))||((b*b)+(c*c)==(a*a)))
				{
					System.out.println("The triangle is an right angled triangle");
				}
				else if ((a!=b && a!=c && b==c)||(a==b && a!=c && b!=c)||(a!=b && a==c && b!=c))
				{
					System.out.println("The triangle is an Isoceles triangle");
				}
				else if(a==b && a==c && b==c)
				{
					System.out.println("The triangle is an equilatoral triangle");
				}
			}
			else
			System.out.println("Its an invalid triangle");
		}
		catch (Exception e)
		{
			System.err.println("Error");
		}
		finally
		{
			System.out.println("Triangle is determind successfully..");
		}
	}

	public static void main(String[] args) 
	{
		Triangle obj = new Triangle();
		obj.triangle();
		obj.TraingleType();
	}

}
