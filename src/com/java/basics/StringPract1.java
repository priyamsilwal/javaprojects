package com.java.basics;


public class StringPract1 {

	public static void main(String[] args) 
	{
		String s1 = new String("cfgdfgfdgsdgat");
		String s2 = new String("cow");
		String s3 = null;
		String s4 = new String("cat");  s3=s2;
		String s5 = "cat"; // string literal ; all string literals are found in string pool ; 
		String s6 = "cat";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		if (s3==s2) // To check if we are comparing the strings 
		{
			System.out.println(s1.compareTo(s2));
		}
		else
			System.out.println("Strings are not equal");
		
		if (s1 == s2) // To check if we are comparing the handles
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		
		if (s3.equals(s2)) // To check if we are comparing the strings 
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		
		if (s5.equals(s6)) // To check if we are comparing the strings 
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		if (s5==s6) // To check if we are comparing the strings 
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
		
		s3 = s1+s2 + "ok"; // string concatenation
		System.out.println(s3);
		
		s1.substring(2);
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(1, 2));
	}

}
