/* Initially we knew we can only declare methods in interface 
 * Now from java 1.8 onwards we can also define methods in interface
 * To solve the multiple INHERITENCE issue in interface we can simply define the method in object 
class to avoid the ambiguity if there are same methods in 2 interfaces
 * In below interface we have defined a method ball still the class is a functional interface as there is only one abstract class
 * We can create object of an interface by defining static method in interface
 * We can initialize variable in interface but such variables will be constant variable(by default it is FINAL)
 */

package com.java.basics;

interface Cricket
{
	void bat();
	default void ball()
	{
		System.out.println("This ball is in cricket interface");
	}
	static void wicket() // static method defined in interface
	{
		int i = 3; // Final keyword is by default used in this variable hence it is constant and cannot be changed 
		System.out.println("There are " + i + " wickets down");
	}
}
interface Player
{
	default void ball()
	{
		System.out.println("This ball is in player interface");
	}
}
class Pitch implements Cricket, Player
{
	public void bat()
	{
		System.out.println("Its a pitch bat");
	}

	public void ball()
	{
		System.out.println("Its a pitch ball");
	}
}
class Participant implements Cricket, Player
{
	public void bat()
	{
		System.out.println("Its a pitch bat");
	}

	public void ball()
	{
		Player.super.ball();
	}
}
public class MullInheritenceissuewithInterface {

	public static void main(String[] args) {
		Cricket play = new Participant(); 		
		play.bat();
		play.ball();
		Cricket.wicket(); // static method called in object


	}

}
