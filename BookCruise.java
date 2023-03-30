/**
File: BookCruise.java
Author: Rahul Rampal r_rampal (1126609)
Date: 14-Mar-2023 7:20:11 pm
Description: write a java program using UML diagram that will use the setters and getters methods 
to access the data values in the other class. This is the main method for that class, where we called
getters and setters.
*/

/*
 * pseudo code
 * 1 We have implemented getters and setters in Cruiseship class
 * 2 We will use those methods in this class (BookCruise) to access private values from that class
 * 3 Then we displayed the info
 * 4 Then we made changes in two-arg constructor using setter method and retested the code again
 */

package javaclass; // i have made my class in this package, kindly comment this package while running this program at your end, it will run fine at your end
import java.util.*;
public class BookCruise {

	public static void main(String[] args) {
		
		//Declare & instantiate a number of different cruises
		CruiseShip cruiseOne = new CruiseShip();
		CruiseShip cruiseTwo = new CruiseShip("Norwegian Dawn","Norwegian Dawn");
		CruiseShip cruiseThree = new CruiseShip("Royal Carribean", "Navigator of the Seas", 2750);
		
		//Display info about all cruises
		System.out.println("Line of cruiseone is called " + cruiseOne.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseOne.getName() + " and capacity is " + cruiseOne.getCapacity());

		
		System.out.println("\n Line of cruiseTwo is called " + cruiseTwo.getCruiseLine() + ".");
		//The print statement below will check our defaultCapacity() function that we made as a utility function, as our capacity wil be generated by that
		System.out.println("Name is " + cruiseTwo.getName() + " and capacity is " + cruiseTwo.getCapacity());

		System.out.println("\n Line of cruiseThree is called " + cruiseThree.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseThree.getName() + " and capacity is " + cruiseThree.getCapacity());
	
		//Change properties of our cruiseTwo object
		cruiseTwo.setCruiseLine("Costa");
		cruiseTwo.setName("Jewel");
		cruiseTwo.setCapacity(2565);
		
		//Display info for the new and improved cruiseTwo object
		System.out.println("\n Line of cruiseTwo is called " + cruiseTwo.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseTwo.getName() + " and capacity is " + cruiseTwo.getCapacity());

		////Displaying and retesting info about all cruises again to check if values remain changed to new one
		System.out.println("\n Line of cruiseone is called " + cruiseOne.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseOne.getName() + " and capacity is " + cruiseOne.getCapacity());

		System.out.println("\n Line of cruiseTwo is called " + cruiseTwo.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseTwo.getName() + " and capacity is " + cruiseTwo.getCapacity());

		System.out.println("\n Line of cruiseThree is called " + cruiseThree.getCruiseLine() + ".");
		System.out.println("Name is " + cruiseThree.getName() + " and capacity is " + cruiseThree.getCapacity());
	
		
		
	}
	
}
