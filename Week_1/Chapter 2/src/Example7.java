import java.util.Scanner;

public class Example7 
{

	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		double radius, depth;
		double amoutWater;
		
		
		System.out.println("THis program blehl bleha w bitch boi sounds");
		
		System.out.println("Enter the radius of the well");
		radius = keyboard.nextInt();
		//This is my radius, putting it in inches
		
		System.out.println("Enter the depth of the well");
		depth=keyboard.nextInt();
		//This is my depth, putting it in inches
		
		radius = radius/12;
		
		amoutWater=3.14*radius*radius*depth;
		
		double n;
		//n is our display value.
		n = amoutWater*7.48;
		
		System.out.println("The well can hold about "+n+"gallon of water");
	}

}
