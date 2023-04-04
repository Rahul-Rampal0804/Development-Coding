package javaclass;

public class Mammal extends AnimalOne
{
private String mammalType;
	
	public Mammal(String mType)
	{
		super("Mammal");
		this.mammalType = mType;
	}
	
	//accessor method
	public String getMammalType()
	{
		return this.mammalType;
	}	

	@Override
	/*
	 Method Name:  reproduce
	     Purpose:  to describe how an animal reproduces
	     Accepts:  nothing
	     Returns:  String
	 */
	public String reproduce()
	{
		return "This " + this.mammalType + " gives live birth";
	}
	
	@Override
	/*
	 Method Name:  describeAnimal
	     Purpose:  to describe the animal
	     Accepts:  nothing
	     Returns:  String
	 */
	public String describeAnimal()
		{
			return "This " + this.getType() + " is a " + this.mammalType;
		}

}
