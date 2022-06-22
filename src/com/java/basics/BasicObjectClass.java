package com.java.basics;

class Calc
{
	int x;
	int y;
	int result;

	public void Add()
	{
		result = x + y;
		System.out.println("Adding numbers " +  x + " " +  "and " + y );
	}
}
public class BasicObjectClass {

	public static void main(String[] args) {

		Calc obj = new Calc();
		obj.x = 2; 	
		obj.y = 3;
		obj.Add();
		System.out.println("The addition of value is " + obj.result);	

	}

}
	