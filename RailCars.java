/**
File: RailCars.java
Author: Rahul Rampal r_rampal (1126609)
Date: 10-Feb-2023 5:23:11 pm
Description: write a java program that will calculate the minimum number of rail cars
required to do this as well as the numbers of automobiles that can be shipped given the
number of available rail cars. 
*/

package javaclass; // i have made my class in this package, kindly comment this package while running this program at your end, it will run fine at your end
import java.util.Scanner;
import java.util.*;

public class RailCars {
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
  
	    //The title
	    System.out.println("RailCar Capacity Analysis");
	    System.out.println("-------------------------------");  
	    System.out.println("First some information is needed..."); 

	    // Ask the user to enter the railway company name
	    System.out.print("Enter the name of the railway company: ");
	    String railCompany = sc.nextLine();
	 
	    // Ask the user to enter the number of automobiles needed to be shipped
	    System.out.print("Enter the number of automobiles waiting at the "+ railCompany +" rail yard: ");
	    int numOfAutomobilesToShip = sc.nextInt();
	 
	    // Ask the user to enter the number of automobiles that can be carried by one rail car
	    System.out.print("Enter the maximum number of automobiles per rail car (36 to 48): ");
	    int maxAutomobilesPerRailCar = sc.nextInt();
	    
	    //while loop for eradicating the invalid values
	    while (maxAutomobilesPerRailCar < 36 || maxAutomobilesPerRailCar > 48) {
	      System.out.println("Invalid input. Please enter a number between 36 and 48.");
	      System.out.print("Enter the maximum number of automobiles per rail car (36 to 48): ");
	      maxAutomobilesPerRailCar = sc.nextInt();
	    }
	    
	    //enter number of available rail cars at train yard
	    System.out.print("Enter the number of railcars that are available at the "+ railCompany +" rail yard: ");
	    int numOfAvailableRailCars = sc.nextInt();

	    // Calculate the minimum number of railcars required to carry all of the automobiles
	    // ceil function - ceil value is the equivalent integer value by rounding up a float or double to the nearest integer 
	    int minNumOfRailCars = (int) Math.ceil((double) numOfAutomobilesToShip / maxAutomobilesPerRailCar);

	    // Calculate the number of automobiles that would be shipped if the available railcars were filled and the percentage of the same
	    int automobilesShipped = Math.min(numOfAutomobilesToShip, numOfAvailableRailCars * maxAutomobilesPerRailCar);
	    double shippedPercentage = (double) automobilesShipped / numOfAutomobilesToShip * 100;

	    // Calculate the number of automobiles that would be left behind and the percentage of the same
	    int automobilesLeftBehind = numOfAutomobilesToShip - automobilesShipped;
	    double leftBehindPercentage = (double) automobilesLeftBehind / numOfAutomobilesToShip * 100;

	    // Displaying the results
	    System.out.println("Here are the results...");
	    
	    System.out.println("-------------------------------------");
	    
	    System.out.println("Minimum number of " + minNumOfRailCars + " rail cars are required to ship every automobile in the yard");
	   
	    System.out.println( automobilesShipped + " automobiles " + " (" + shippedPercentage + "%)" + "would be shipped");
	   
	    //when 0 automobiles would be left behind
	    if(shippedPercentage == 100) {
	    	System.out.println("0 automobiles (0.0%) would be left behind");
	    }
	    
	    //when there are some automobiles that are left behind
	    if (automobilesLeftBehind > 0) {
	      System.out.println( automobilesLeftBehind + " automobiles " + " (" + leftBehindPercentage + "%)" + "would be left behind");
	    } else {
	    //condition to check how many more automobiles could have fit into it
	      int additionalCars = (numOfAvailableRailCars * maxAutomobilesPerRailCar) - numOfAutomobilesToShip;
	      System.out.println("There would be room for an extra " + additionalCars + " automobiles on the rail cars");
	    }
	    //closing the scanner object
	    sc.close();
	    
	  }
	}


