package com.java.basics;

class StaticData
{
	int empid;
	int salary;
	static String ceo;
	String name;

	public StaticData()
	{
		salary = 20000;
	}
	static
	{
		ceo = "Larry";
	}
	public void empdata()
	{ 
		System.out.println("The data of " + name + " | " + empid + " | " + salary + " | " + ceo);
	}
}
public class StaticPract {

	public static void main(String[] args) {
		
		StaticData Priyam = new StaticData();
		Priyam.name = "Priyanka";
		Priyam.empid = 15073;
		
		StaticData Mahir = new StaticData();
		Mahir.name = "Mahira";
		Mahir.empid = 15072;
	
		Mahir.empdata();
		Priyam.empdata();
	}
}

/* Static variable is the instance variable and not saved in the heap memory
 * Once any value is initialized it is applicable through out 
 * We can also initialized static variables in static block and non static variables in constructors
 */
  
