//Anonymous class is a class which is created after object creation and can be called on once
package com.java.basics;

class Alaphabet
{
	public void alphabets()
	{
		System.out.println("A is the first letter");
	}
}
public class AnonymousClassPrac {

	public static void main(String[] args) 
	{
		Alaphabet obj = new Alaphabet()
		{
			public void alphabets()
			{
				System.out.println("A is the first letter of Alphabet series");
			}			
		};
		obj.alphabets();

	}

}
