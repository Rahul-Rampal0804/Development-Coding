package javaclass;

public class Dog extends Animal{
//one explicit constructor and private variable in the subclass is good 
	private String name;
	private String breed;
	
	public Dog (String aName) {
		super("Dog"); //calls the base class constructor
		name=aName;
		breed ="Unknown";
		
	}
	public Dog(String aName, String aBreed) {
		super("Dog");
		this.name=aName;
		this.breed=aBreed;
		
		
	}
}
