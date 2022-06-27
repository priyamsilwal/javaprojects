/*
 * Before initializing every constructor super class is called 
 * By default in every constructor of subclass first default super class is called 
 * in order to call any other constructor of super class we need to pass the parameter in super class 
 */

package com.java.basics;

class A
{ 
	public A()
	{
		System.out.println("in A");
	}
	public A(int i)
	{
		System.out.println("in int A");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int i)
	{
		super(i);
		System.out.println("in int B");
	}
}
public class InheritencePrac {

	public static void main(String[] args) {
		B obj = new B(6);		
		
	}

}
