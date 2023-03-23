package javaclass;

public class CoffeeTest {
	public static void main(String[] args)
	{
		// Creating objects for all three constructors
		/*Coffee coffeeOne = new Coffee();
		Coffee coffeeTwo = new Coffee("Van Houte", "Holiday Blend");
		Coffee coffeeThree = new Coffee("Green Mountain", "Peru", "dark roast");
		
		// All printing statements
		System.out.println("Here's your Coffee Order One");
		System.out.println("---------------------------------------");
		//coffeeOne.getName(); //getManufacturers
		//"\nCoffee three was originally called"+...getters methods , setters down below
		System.out.println("One " + coffeeOne.getManufacturer() + "'s " + coffeeOne.getStrength() + " " + coffeeOne.getName());
		System.out.println("---------------------------------------");
		
		System.out.println("\nHere's your Coffee Order Two");
		System.out.println("---------------------------------------");
		System.out.println("One " + coffeeTwo.getManufacturer() + "'s " + coffeeTwo.getStrength() + " " + coffeeTwo.getName());
		System.out.println("---------------------------------------");
		
		// Changing the value passed to the constructor with three arguments using its object and setter methods
		coffeeThree.setManufacturer("Starbuck");
		coffeeThree.setManufacturer("Blonde");
		//coffeeThree.setManufacturer("Medium roast");
		
		System.out.println("\nHere's your Coffee Order Three");
		System.out.println("---------------------------------------");
		System.out.println("One " + coffeeThree.getManufacturer() + "'s " + coffeeThree.getStrength() + " " + coffeeThree.getName());
		System.out.println("---------------------------------------"); */
		
		//Declare & instantiate a number of different Coffees
		Coffee coffeeOne = new Coffee();
		Coffee coffeeTwo = new Coffee("Van Houte","Holiday Blend");
		Coffee coffeeThree = new Coffee("Green Mountain", "Peru", "medium roast");
		
		//Display info about all Coffees manufactured
		System.out.println("Coffee one is called " + coffeeOne.getName() + ".");
		System.out.println("It is a " + coffeeOne.getStrength() + " coffee made by " + coffeeOne.getManufacturer());

		System.out.println("\nCoffee two is called " + coffeeTwo.getName() + ".");
		System.out.println("It is a " + coffeeTwo.getStrength() + " coffee made by " + coffeeTwo.getManufacturer());

		System.out.println("\nCoffee three was originally called " + coffeeThree.getName() + ".");
		System.out.println("It was a " + coffeeThree.getStrength() + " coffee made by " + coffeeThree.getManufacturer());
	
		//Change properties of our CoffeeThree object
		coffeeThree.setName("Blonde");
		coffeeThree.setManufacturer("Starbucks");
		//coffeeThree.setString("medium roast");
		
		//Display info for the new and improved CoffeeThree object
		System.out.println("\nCoffee three got updated! It is now called " + coffeeThree.getName() + ".");
		System.out.println("It is a " + coffeeThree.getStrength() + " coffee made by " + coffeeThree.getManufacturer());
		System.out.println("Everyone loves the " + coffeeThree.getName() + " coffee!");
	}
}
