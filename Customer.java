package javaclass;

public class Customer {
	private String name;
	private String email;
	private static int id  = 100000;
	private String custID;
	
	public Customer(String name, String email)
	{
		this.name = name;
		this.email = email;
		this.custID = this.generateCustID();
	}
	
	//accessor methods
	public String getCustID()
	{
		return this.custID;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	//mutator methods
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	/*
	  Method Name:  generateCustID
	      Purpose:  to create a unique identifier for each object
	      Accepts:  nothing
	      Returns:  String
	 */
	private String generateCustID()
	{
		String hold = "";
		hold = hold + this.name.charAt(0) + id;
		id ++;
		return hold;
	}

}

