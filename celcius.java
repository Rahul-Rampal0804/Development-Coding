package javaclass;
/*1. display title
 * Ask the user to enter the following values:
a. The name of the railway company (such as CP Rail)
b. The number of automobiles that need to be shipped
c. The maximum number of automobiles that can be carried by one rail car
assuming all the rail cars on the train are the same size.
You need Data Validation here: The minimum number of automobiles that
can be carried on a rail car is 36. The maximum is 48.
d. The actual number of railcars that are available at the train yard.
3. Calculate and display the following results:
a. The minimum number of railcars required to carry all of the automobiles
b. The number of automobiles that would be shipped if the available railcars
were filled (but not beyond the number of automobiles that need to be
shipped) as well as the percentage that this represents of all the automobiles
on the train.
c. The number of automobiles that would be left behind as well as the
percentage that this represents of all the automobiles on the train.
d. If there are no automobiles left behind, then also display the number of
additional automobiles that could be carried by the rail cars if they were all
filled to capacity regardless of whether this number is greater than the
number of automobiles on the train.
 */
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class celcius {



public static void main(String[] args) {
	
	
	//methods in java
	 System.out.println("program will calculate and display some statistics about a commodity");
	 System.out.println("--------------------------------------------------------------------"); 
	
	
	Scanner sc= new Scanner(System.in);
	
	
	System.out.println("What is the name of the commodity");
	String commodityName = sc.nextLine();
	
	System.out.println("how many days data you want to track?");
	int numDays= sc.nextInt();
	
	double [] pricesArray = new double [numDays];  
	for(int i=0; i< pricesArray.length; i++) {
		
		System.out.println("Enter price and press enter");
		pricesArray[i]= sc.nextDouble();
		
	}
	
	double result1= average(pricesArray);
	double y= Math.floor(result1*100)/100;
	System.out.println("reult 1="+ y);
	
	double max1= highest(pricesArray);
	System.out.println("highest="+ max1);
	
	double min1= lowest(pricesArray);
	
	System.out.println("lowest="+ min1);
	
	double range1= range(pricesArray);
	double x= Math.floor(range1*100)/100;
	System.out.println("range="+ x);
	
}

public static double average(double arr[]) {
	
	double average=0;
	double total=0;
	for(int i=0; i< arr.length;i++) {
		total+=arr[i];
		
	}
	average = total/arr.length;
	return average;
	
}

public static double highest (double arr[]) {
	
	int length1 = arr.length;
	Arrays.sort(arr);
	
	return arr[length1-1];
	
}
public static double lowest (double arr[]) {
	
	Arrays.sort(arr);
	
	return arr[0];
	
}
public static double range(double arr[]) {
	Arrays.sort(arr);
	return (arr[arr.length-1]-arr[0]);
	
	
}

}
