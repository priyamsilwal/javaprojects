/*
 * @override will give you compile time error instead of logical error
 */
package com.java.basics;

 class Apps
 {
	 public void show()
	 {
		 System.out.println("in A");
	 }
 }
 class Basket extends Apps
 { 
	 public void show()
	 {
		 super.show(); //this will call the show method of super class
		 System.out.println("in B");
	 }
 }
public class MethodOverridePrac {

	public static void main(String[] args) {
		Basket priyam = new Basket();
		priyam.show();
	}

}
