/*Abstract class is used when we don't want to instantiate/create any object of that class 
 * All methods of an abstract class must me abstract method 
 * 
 * 
 */

package com.java.basics;

class Printer
{	
	public void show(Number t) // Number is the default abstract class of Integer,Double,float
	{
		System.out.println("The number printed is " + t);
	}
}

public class AbstractPract {

	public static void main(String[] args) {

		Printer obj = new Printer();
		obj.show(3);
	}

}
