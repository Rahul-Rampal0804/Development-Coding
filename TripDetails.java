/**
File: TripDetails.java
Author: Rahul Rampal r_rampal (1126609)
Date: 10-Apr-2023 5:58:13 pm
Description: This is TripDetails class, Where we are testing the polymorphism of the classes and how they can be accessed in main class, We are testing accessors, mutuators here.
And also other important functionalities are being tested. 
*/

//program is showing all the correct output, if some areas are commented as explained below, but i did not comment those as we need to call all getters
package javaclass;

public class TripDetails {
	public static void main(String[] args)
	{
		String [] ActivitiesInCruise = {"3 Pools", "Mini golf", "4 hot tubs", "Basketball court", "4 shuffle board play areas", "Library", "Fitness centre", "Spa", "3 waterslides", "Arcade", "Theatre", "Bingo"};
		String [] activitiesInResorts = {"5 Pools", "Golf course", "6 hot tubs", "Tennis court", "Shuffle board", "Horse shoes", "Fitness centre", "Archery", "Water sports"};
		String [] activitiesAllInclusive = {"2 Pools", "Mini golf", "Gold course", "Hot tub", "Basketball court", "Fitness centre", "Spa", "Waterslides", "Movie theatre", "Bingo", "Water sports", "Island tours"};
		String [] activitiesInRiverCruise = {"Pool", "2 hot tubs", "Library", "Spa", "Bingo", "Comedy club"};
		
		//Making 4 objects for each entity as required
		Cruise cruiseObject = new Cruise("Carribean", 9, "Carnival", "Magic", 7078, "Balcony", ActivitiesInCruise);
		RiverCruise riverObject = new RiverCruise("European", 14, "Avalon", "Envision", 3014, "River view", "Rhine", activitiesInRiverCruise);
		Resort resortObject = new Resort("Dominican Republic", 7, "Swindles", 14, "Junior", activitiesInResorts);
		AllInclusive inclusiveObject = new AllInclusive("Tahiti", 14, "SunDrench Resort", 35, "Family", 14, 10, activitiesAllInclusive);
		
		System.out.println("Welcome to Fanshawe Travel Agency");
		System.out.println("**********************************\n");
		System.out.println("We have researched four fabulous vacation getaways for you and now offer them to you for your perusal.\n");

		
		
		// calling the accessor methods
		System.out.println("Here are the details for your " + cruiseObject.getType() + " selection:");
		System.out.println("Destination - " + cruiseObject.getDestination());
		System.out.println("CruiseLine - " + cruiseObject.getCruiseLine());
		System.out.println("Ship Name - " + cruiseObject.getShipName());
		System.out.println("Cruise duration - " + cruiseObject.getDuration() + "  days");
		System.out.println("Accomodation Type - " + cruiseObject.getAccomodationType());
		System.out.println("Room number - " + cruiseObject.getRoomNumber());
		
		
		System.out.println("Here are your list of activities : ");  //Comment the lines from 36-41 to get exact output that is required, but i did not commented because we need to call all the getters, so this should also be called
		
		for(int i=0; i < cruiseObject.getActivities().length;i++)
		{
			System.out.println("");
			
			System.out.println(cruiseObject.getActivities()[i]);
		}
		
		// calling the accessor methods
		System.out.println(" ");
		
		System.out.println("Here are the details for your " + riverObject.getType() + " selection:");
		System.out.println("Destination - " + riverObject.getDestination());
		System.out.println("River - " + riverObject.getRiver());
		System.out.println("CruiseLine - " + riverObject.getCruiseLine());
		System.out.println("Ship Name - " + riverObject.getShipName());
		System.out.println("Cruise duration - " + riverObject.getDuration() + " days");
		System.out.println("Accomodation Type - " + riverObject.getAccomodationType());
		System.out.println("Room number - " + riverObject.getRoomNumber());
		
		//Comment the lines from 56-61 to get exact output that is required, but i did not commented because we need to call all the getters, so this should also be called
		System.out.println("Your list of activities - ");
		for(int i=0; i < riverObject.getActivities().length;i++)
		{
			System.out.println("");
			System.out.println(riverObject.getActivities()[i]);
		}
		
		// calling the accessor methods
		System.out.println("");
		System.out.println("Here are the details for your: " + resortObject.getType() + " selection:");
		System.out.println("Destination: " + resortObject.getDestination());
		System.out.println("Resort Name: " + resortObject.getResortName());
		System.out.println("Unit Type: " + resortObject.getUnitType());
		System.out.println("Unit Number: " + resortObject.getUnitNumber());
		System.out.println("Vacation duration: " + resortObject.getDuration() + " days");
		
		//Comment the lines from 73-78 to get exact output that is required, but i did not commented because we need to call all the getters, so this should also be called
		System.out.println("Your list of activities - ");
		for(int i=0; i < resortObject.getActivities().length;i++)
		{
			System.out.println("");
			System.out.println(resortObject.getActivities()[i]);
		}
		
		// calling the accessor methods
		System.out.println("");
		System.out.println("Here are the details for your " + inclusiveObject.getType() + " resort selection:");
		System.out.println("Destination - " + inclusiveObject.getDestination());
		System.out.println("Resort Name - " + inclusiveObject.getResortName());
		System.out.println("Unit Type - " + inclusiveObject.getUnitType());
		System.out.println("Unit Number - " + inclusiveObject.getUnitNumber());
		System.out.println("Vacation duration - " + inclusiveObject.getDuration() + " days");
		System.out.println("Dining Facilities - " + inclusiveObject.getDiningFacilities());
		System.out.println("Drink Limit - " + inclusiveObject.getDrinkLimit());
		
		//Comment the lines from 92-97 to get exact output that is required, but i did not commented because we need to call all the getters, so this should also be called
		System.out.println("Your list of activities - ");
		for(int i=0; i < inclusiveObject.getActivities().length;i++)
		{
			System.out.println("");
			System.out.println(inclusiveObject.getActivities()[i]);
		}
		
		// calling the mutuator methods
		resortObject.setDestination("Jamaica");
		resortObject.setDuration(21);
		resortObject.setResortName("Sandals");
		resortObject.setUnitNumber(42);
		resortObject.setUnitType("studio");
		
		// calling the accessor methods
		System.out.println("");
		System.out.println("We have updated " + resortObject.getType() + " vacation and present it to your consideration");
		System.out.println("Destination - " + resortObject.getDestination());
		System.out.println("Resort Name - " + resortObject.getResortName());
		System.out.println("Unit Type - " + resortObject.getUnitType());
		System.out.println("Unit Number - " + resortObject.getUnitNumber());
		System.out.println("Vacation duration - " + resortObject.getDuration() + " days");
		
		
		// Travel array to store 4 objects
		Travel [] takeVacations = new Travel[4];
		takeVacations[0] = cruiseObject;
		takeVacations[1] = riverObject;
		takeVacations[2] = resortObject;
		takeVacations[3] = inclusiveObject;
		
		int t= takeVacations.length; 
		
		for(int i = 0; i < t;i++)
		{
			System.out.println(takeVacations[i].describeTrip());
			
			System.out.println(takeVacations[i].showAccomodation());
			
			//The java "instanceof" operator is used to test whether the object is an instance of the specified type (class or subclass or interface)
			//if else is used to check the instance is from which parent class
			if(takeVacations[i] instanceof AllInclusive)
			{
				
				System.out.println("Here's the activities available on the " + inclusiveObject.getResortName() + " resort in " + inclusiveObject.getDestination()); //using getters
			}
			else if(takeVacations[i] instanceof Resort)
			{
				
				System.out.println("Here's the activities available on the " + resortObject.getResortName() + " resort in " + resortObject.getDestination()); //using getters
			}
			else if(takeVacations[i] instanceof RiverCruise)
			{
				
				System.out.println("Here are further activities available on the " + riverObject.getCruiseLine() + " " + riverObject.getShipName()); //using getters
			}
			else
			{
				System.out.println("Here are further activities available on the " + cruiseObject.getCruiseLine() + " " + cruiseObject.getShipName()); //using getters
			}
			takeVacations[i].listActivities(); //to list the activities
			System.out.println("\n");
		}
			System.out.println("");
		
		
		//calling other required functionalities
		riverObject.addActivity("A Games room");
		riverObject.listActivities(); //to list the activities
		
		//removing entity and listing activities
		inclusiveObject.removeActivity("hot tub");
		inclusiveObject.listActivities(); //to list the activities
		
		System.out.println("Thank you for contacting Fanshawe Travel Agency.\n");
		System.out.println("We believe we have put together some amazing vacations for your enjoyment.\n");
		System.out.println("Please contact us if you would like to book one of these exciting opportunities.\n");
}
}