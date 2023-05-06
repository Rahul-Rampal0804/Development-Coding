
/*
     File Name: Motel.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 10:29:47 a.m.
   Description: This class extends from Accommodation and follows the specifications from the
                uml diagram
*/
public class Motel extends Accommodation
{
	private String bedType;
	private int unitNumber;
	
	public Motel(String location, String bed, int unit)
	{
		super("motel", location);
		this.bedType = bed;
		this.unitNumber = unit;
	}
	
	//accessor and mutator methods
	public int getUnit()
	{
		return this.unitNumber;
	}	
	public String getBedType()
	{
		return this.bedType;
	}
	public void setUnit(int unit)
	{
		this.unitNumber = unit;
	}
	public void setBedType(String bed)
	{
		this.bedType = bed;
	}
	
	/*
  Method Name:  describeAccommodation
      Purpose:  to describe what the accomodation is all about
      Accepts:  nothing
      Returns:  void
 */
	public void describeAccomodation()	
	{
		System.out.println("This " + this.getType() + " dwelling is located at " + this.getLocation() +
				               "\nIt is identified by unit number " + this.unitNumber + " and has a " + 
				               this.bedType + " bed provided for your comfort.");
	}
}
