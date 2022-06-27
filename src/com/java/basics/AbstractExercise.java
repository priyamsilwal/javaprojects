package com.java.basics;

abstract class writer
{
	String a;
	String b;
	public abstract void write(String a);
}

class Pen extends writer
{

	public void write(String a)
	{
		System.out.println("Writer is writing with " + a);
	}
}
class Pencil extends writer
{

	public void write(String a)
	{
		System.out.println("Writer is writing with " + b);
	}
}
public class AbstractExercise {

	public static void main(String[] args) {

		Pen obj = new Pen();
		obj.a = "Pens";
		obj.b = "Pencils";
		obj.write(obj.a);
		obj.write(obj.b);
	}
}
