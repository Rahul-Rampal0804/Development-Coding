package javaclass;

/**
	   File: incrementexample.java
     Author: Rahul Rampal
	   Date: 10-Jan-2023 4:18:59 pm
Description:  
 */
public class incrementexample
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//System.out.println("hi");
		int []arr= new int[6];
			
			for(int i=0; i<6;i++) {
		 double z= Math.random();
		 if(z!=0) {
				arr[i]=(int)(z*49+1);
		
		 }
			
			}
			for(int i=0; i<6;i++) {
				
				
				System.out.println(arr[i]);
					
					}
	  
	}

}
