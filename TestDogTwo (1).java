
/**
   Filename: TestDogTwo.java
     Author: Shelley Lapkowski
       Date: Mar 6, 2023 12:18:27 p.m.
Description: This class will test my DogTwo class, specifically creation of DogTwo objects
					   and calling of toString() method of DogTwo
 */
public class TestDogTwo
{
	public static void main(String[] args)
	{
		//create objects
		DogTwo myDog = new DogTwo ("Boxer", "SomeDog");
		DogTwo starDog = new DogTwo ("Lassie");
		
		//print out results of toString() method of DogTwo objects
		System.out.println(myDog.toString());
		System.out.println();
		System.out.println(starDog.toString());
	}
	
}