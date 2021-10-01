import java.util.Scanner;
import java.io.Serializable;

public class VacuumBarrel extends Barrel implements Serializable
{

	{
		get();
		/**
		add(VacuumBarrel);
		subtract(VacuumBarrel);
		Divide(int);
		equals(VacuumBarrel);
		greaterThan(VacuumBarrel);
		
		toKelvin();
		toFahrenheit();
		toCelsius();
		toString();
		**/
		
		
	      double[] VacuumBarrel = {2.9, 3.4, 3.5};
	      // Print all the array elements
	      for (int i = 0; i < VacuumBarrel.length; i++) {
	         System.out.println(VacuumBarrel[i] + " ");
	      }
	     
	      // Summing all elements
	      double total = 0;
	      for (int i = 0; i < VacuumBarrel.length; i++) {
	         total += VacuumBarrel[i];
	      }
	      System.out.println("Total is " + total);
	      
	      // Finding the largest element
	      double max = VacuumBarrel[0];
	      for (int i = 1; i < VacuumBarrel.length; i++) {
	         if (VacuumBarrel[i] > max) max = VacuumBarrel[i];
	      }
	      System.out.println("Max is " + max);  
	   }
		
	public add(VaccumBarrel) {
		
	}
	
	private toFahrenheit() 
	{
		
	}
	
	
	
	
	}
	
	

