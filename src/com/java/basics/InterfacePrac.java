/* In Interface all methods are by default abstract
 * In Abstract class methods can or cannot be abstract 
 * We cannot create the object of an interface we can only take the reference of the object
 * When we create a class we need to implement interface and when we create an abstract class we need to extend it
 * 
 */

package com.java.basics;

interface species
{
	void nature();
	void sound();
}
abstract class animal 
{
	public abstract void sound();
}
class Cat extends animal implements species
{
	public void sound()
	{
		System.out.println("makes low sound");
	}
	public void nature()
	{
		System.out.println("Cat is cunning");
	}
}	
class Dog extends animal implements species
{
	public void sound()
	{
		System.out.println("makes loud sound");
	}
	public void nature()
	{
		System.out.println("Dog is careful");
	}
	public void doSomethingspecial(species s)
	{
		s.nature();
	}
}
public class InterfacePrac {

	public static void main(String[] args)
	{
		species jungle = new Cat();
		jungle.nature();
		jungle.sound();

		species jungle1 = new Dog();
		jungle1.nature();
		jungle1.sound();

	}

}
