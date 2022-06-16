package com.java.basics;

public class MyJavaLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("its my first program");
		
		// Check if the number is even or odd by if else
		int i = 10;
		
		if(i%2 == 0)
			System.out.println("The provided number is an even number");
		else
			System.out.println("The provide number is a odd number");	
		
		//Check Ternary Operator
		
		int a = 0;
		a=i>6?1:2;
		System.out.println(a);
	}

}
