

public class Corporate extends Customer
{
	// Declaring variables
	private double salesAmount = 0.0;
	private int numPurchases = 0;
	
	// no-arg constructor
	public Corporate()
	{
		super("Corporate");
		this.salesAmount = 55000.00;
		this.numPurchases = 5;
	}
	
	// three-args constructor
	public Corporate(String name, double salesAmount, int numPurchases)
	{
		super("Corporate", name);
		this.salesAmount = salesAmount;
		this.numPurchases = numPurchases;
	}
	
	// Getter methods
	public double getSales()
	{
		return this.salesAmount;
	}
	
	public int getNumPurchases()
	{
		return this.numPurchases;
	}
	
	// Setter methods
	public void setSales(double sales)
	{
		this.salesAmount = sales;
	}
	
	public void setNumPurchases(int numPurchases)
	{
		this.numPurchases = numPurchases;
	}
	
	/* Method Name: reportAverageSales
	 * Purpose: To report the average sales of Corporate World
	 * Accepts: N/A
	 * Returns: double
	 */
	@Override
	public double reportAverageSales()
	{
		return this.salesAmount/this.numPurchases;
	}
	
	/* Method Name: toString
	 * Purpose: To print report for Corporate world
	 * Accepts: N/A
	 * Returns: String
	 */
	public String toString()
	{
		return super.toString() + " this company, " + this.getName() + " made " + this.numPurchases + " purchases for a total of $" + this.salesAmount;
	}

}
