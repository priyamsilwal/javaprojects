package com.java.basics;

public class TryCatchPrac 
{
	public void AreaofCircle()
	{
		try
		{
			int r = 8;
			final double p = 3.14;
			double result = p*r*r;
			System.out.println("Area of circle is " + result);
		}
		catch (Exception e)
		{
			System.err.println("It is not a circle");
		}
		
		finally
		{
			System.out.println("bye");
		}
		}

	public static void main(String[] args) {
		
		TryCatchPrac obj = new TryCatchPrac();
		obj.AreaofCircle();

	}

}
