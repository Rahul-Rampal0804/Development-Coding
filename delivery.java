package javaclass;
import java.util.*;
public class delivery {
	public static void main(String[] args) {
//System.out.println("hi");
		final int USER_ID=99;
		Scanner sc=new Scanner(System.in);
		System.out.println("fill id");
		int u_id=sc.nextInt();
		
		if(u_id==USER_ID) {
			System.out.println("l");
			double l=sc.nextDouble();
			System.out.println("w");
			double w=sc.nextDouble();
			System.out.println("h");
			double h=sc.nextDouble();
			double volume= l*w*h;
			double volumeinMeters= (double)(volume/1000000);
			
			int realVol= (int)(volumeinMeters*100);
			
			System.out.println(realVol/100);
			System.out.println(realVol);
			//System.out.println(volumeinMeters);
			System.out.println("fill weight");
			double weight= sc.nextDouble();
			if(w<27 && (realVol) <=10) {
				System.out.println("shipping");
				
			}
			
		}
		
}
}