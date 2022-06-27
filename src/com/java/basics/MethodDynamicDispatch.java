package com.java.basics;

class Friends
{
	public void show()
	{
		System.out.println("in class friends");
	}
}
class Family extends Friends
{
	public void show()
	{
		System.out.println("in class family");
	}
}
class Office extends Friends
{
	public void show()
	{
		System.out.println("in class Office");
	}
}
public class MethodDynamicDispatch {

	public static void main(String[] args) {
		Friends obj = new Family(); 
		//We can create the reference of A and object of B.such object is created only during the runtime hence called runtime polymorphism
		//I doesn't matter what reference is used what matters is implementation
		//If we use the reference of super class and the object of subclass it will always call the method present in superclass
		obj.show(); //When method is called in such case it will call the method of object B since object B was created
		Friends obj1 = new Office();
		obj1.show(); //Dynamic Method Dispatch

	}

}
