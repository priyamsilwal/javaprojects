package com.java.basics;

class Casio
{
	int x;
	int y;
	String operation;
	public Casio()
	{
		x = 0;
		y = 0;
		operation = "none";	
		System.out.println("We are in constructor 1 where x y is: " + x + " , " + y);
		
	}
	
	public Casio(int i)
	{
		x = i;
		y = 0;
		operation = "none";	
		System.out.println("We are in constructor 2 where x y is: " + x + " , " + y);
	}
	
	public Casio(int i, int j)
	{
		x = i;
		y = j;
		operation = "none";	
		System.out.println("We are in constructor 3 where x y is: " + x + " , " + y);
	}
	
	public Casio(int i, int j, String op)
	{
		x = i;
		y = j;
		operation = op;	
		System.out.println("We are in constructor 4 where x y and sum is: " + x + " , " + y + " " + op);
	}

}

public class MethodandConstructorOverload {

	public static void main(String[] args) {
		Casio obj = new Casio(3,9, "Add");
		
	}

}
