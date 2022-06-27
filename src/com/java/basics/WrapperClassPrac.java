
package com.java.basics;

public class WrapperClassPrac {

	public static void main(String[] args)
	{
		int i = 5; //Primitive dataype
		
		Integer ii = new Integer(i); //wrapping`- putting primitive variable in object is call wrapping
		//instead of using above int we should use class Integer 
	// i is a primitive integer and ii is a reference variable 
		//for all the primitive datatype java has 
		//Putting the value in object is called wraping 
		
		int j = ii.intValue();	// intvalue returns the value of i which is called unwrapping
		//taking the value from object is called wraping
		
		Integer  value = i; //autowraping / autoboxing
		int k = value; // unwraping
		System.out.println(ii);
		System.out.println(j);
		System.out.println(k);
	
		String str = "7";	
		int n =  Integer.parseInt(str);
		System.out.println(n);
		//parsint is a method which take the string and convert it into int. it is accessed with Integer method

	}

}
