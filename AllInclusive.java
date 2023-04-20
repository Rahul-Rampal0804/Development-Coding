/**
File: AllInclusive.java
Author: Rahul Rampal r_rampal (1126609)
Date: 10-Apr-2023 5:16:13 pm
Description: This is AllInclusive class, which will have fields(drinkLimit, diningFacilities ..), Accessors and mutuators
to access the given values  
*/
package javaclass;

public class AllInclusive extends Resort{
	private int drinkLimit;
	private int diningFacilities;
	
	public AllInclusive(String destination, int duration, String resortName, int unit, String unitType, int limit, int facilities,String [] activity)
	{
	super (destination, duration, resortName,"AllInclusive", unit, unitType, activity);
		//super (destination, duration, resortName, unit, unitType, activity);
		this.drinkLimit = limit;
		this.diningFacilities = facilities;
		
	}
	
	public int getDrinkLimit()
	{
		return this.drinkLimit;
	}
	
	public int getDiningFacilities()
	{
		return this.diningFacilities;
	}
	
	public void setDrinkLimit(int drinkLimit)
	{
		this.drinkLimit = drinkLimit;
	}
	
	public void setDiningFacilities(int diningFacilities)
	{
		this.diningFacilities = diningFacilities;
	}
	
//method overriding is done yet again	
@Override
	public String describeTrip()
	{
		return "This is a " + this.getType() + " vacation.\n You will be staying at the " + this.getResortName() + "Resort which is located in " + this.getDestination() + " and will provide you with " + this.getDuration() + " days of relaxation." + "\nYour purchase provides for " + this.getDrinkLimit() + "alcoholic drinks per day and a choice of " + this.getDiningFacilities() + " fabulous dining facilities  with something for every palate.";
	}
}
