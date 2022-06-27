/* Final keyword can be used with Variable, Method , class
 * When final is used in variable it becomes constant
 * When final is used with method no one can override it 
 * When final is used with class no one can extend it 
 */

package com.java.basics;

class FinalClass
{
	final int i = 794;
	public void FinalMethod()
	{
		System.out.println("We are in Final method " + i);
	}
	}
public class FinalKeywordPrac 
{

	public static void main(String[] args) 
	{
		FinalClass obj1 = new FinalClass();
		obj1.FinalMethod();
	}

}
