//Types of interface:
// Normal
// Single abstact method --> Functional interface -- lambda expression -- scala
//Maker interface

package com.java.basics;

interface School
{
	void classrooms(); //Functional interface
}

public class FunctionalInterfacePrac {

	public static void main(String[] args) {
		School obj = () -> System.out.println("There are 39 classes in school"); // Lambda expression
		obj.classrooms();
	}
}
