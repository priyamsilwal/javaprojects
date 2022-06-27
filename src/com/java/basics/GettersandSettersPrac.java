/* What is encapsulation and why it is used ? 
 * Concept of encapsulation is binding data with Methods 
 * We should always use variable as PRIVATE and methods as public 
 * in encapsulation we use getters and setters to access variables via methods
 * Encapsulation is use to make sure data is safe hence the private variable is used instead of public
 * Maintain a log file
 */
package com.java.basics;

class student
{
	private int rollno;
	private String Name;
	private int Marks;

	//gets and setters
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	
}
public class GettersandSettersPrac {

	public static void main(String[] args) {

		student data = new student();
		data.setRollno(32);
		data.setName("Priyam");
		data.setMarks(98);
		
		System.out.println("Roll number is " + data.getRollno());
		System.out.println("Name is " + data.getName());
		System.out.println("Marks scored is " + data.getMarks());
	}

}
