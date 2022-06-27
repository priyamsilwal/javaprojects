//This program is to understand the basic concept of method overloading
package com.java.basics;

class MethodPratice
{
	//int i;
	//int x;

	public void AddNos(int i, int j)
	{
		System.out.println(i/j);
	}
	public void AddNos(int i, int j, double u)
	{
		System.out.println(i*j*u);
	}

	public void AddNos(int i,int j,int k)
	{
		System.out.println(i*j*k);
	}
	public void subNos(int i,int j,int k)
	{
		System.out.println(i-j*k);
	}
}

public class MethodOverloadPrac {

	public static void main(String[] args) {
		MethodPratice obj = new MethodPratice();
		obj.AddNos(0,9);
		obj.AddNos(3,5,9);
		obj.AddNos(3,5,2.4);
		obj.subNos(3,5,200);
	}

}
