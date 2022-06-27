
//We can create the interface of an object by using anonymous class
package com.java.basics;

interface lock
{
	void key();
}
public class AnonymousClassusingInterface {

	public static void main(String[] args) {
		
		lock door = new lock()
		{
			public void key()
			{
				System.out.println("Door is locked with a key");
			}
		};
		door.key();
	}

}
