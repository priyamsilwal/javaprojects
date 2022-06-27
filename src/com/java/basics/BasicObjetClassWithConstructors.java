package com.java.basics;

class BasicCalc
{ 	
	int x;
	int y;
	int result;

	public BasicCalc() //Default constructor
	{
		x = 5;
		y = 10;
		System.out.println("We are in constructor" + x + "and " + y);	
	}
	
	public BasicCalc(int i) //Parameterized constructor
	{
		x = i;
		y = i;
	}
	
	public BasicCalc(int i, int j) //Parameterized constructor
	{
		this.x = i; // this keyword is used to give preference to instance variable instead of local variable when their names are same
		this.y = j;
	}
}
public class BasicObjetClassWithConstructors {

	public static void main(String[] args) {
		BasicCalc obj = new BasicCalc(9,8);
		System.out.println(obj.x + " and " + obj.y);
	}

}

/* Key points to remember:
 * Constructor name is same as class name 
 * Constructor never returns anything 
 * Even if no constructors are created there is always a default condtructor
 */

