/**This Program will take the Weight, Height, Age, and Sex of a person and calculate.
	 We Will use this information to calculate how many chocolate bars must be consumed in order to maintain your body
	 **/
import java.util.Scanner;
public class Example8 {
	public static void main(String args[]) {
		
	//declaring data types
	int COCO, AGE, SEX;
	double WEIGHT, HEIGHT;
	String s1 = new String("man");
	
	String s2  = new String("woman");
	//declaring variable
	COCO = 230;  // Calories in a Chocolate Bar, Book says 230, but it's more around 213ish
	
	//running code
	Scanner keyboard = new Scanner (System.in);
	
	System.out.println ("Welcome, we will calculate how many chocolate bars are required to sustain your current body");
	
	System.out.println ("Please input your AGE in years");
	
	AGE = keyboard.nextInt ();
	
	System.out.println ("Please input your WEIGHT in Pounds");
	
	WEIGHT = keyboard.nextDouble ();
	
	System.out.println ("Please input your HEIGHT in Inches");
	
	HEIGHT = keyboard.nextDouble ();
	
	System.out.println ("Your Height is " + HEIGHT + " in");
	
	System.out.println ("Your Weight is " + WEIGHT + " lb");
	
	System.out.println ("You are " + AGE + " Years old"); //Letting the user input crucial data that will be used for the calculation.

		System.out.println ("Please enter 1 for female, or 2 for Male");
			SEX = keyboard.nextInt();
			//SEX = SEX.toLowerCase(); LEGACY CODE
			if (SEX == 2){
				System.out.println ("MALE");
				double BMR = 655 + (4.3 * WEIGHT) + (4.7 * HEIGHT) - (4.7 * AGE);
				double MT = BMR/COCO;
				System.out.println ("The total amount of calories required to sustain weight " + BMR);
				System.out.println ("total number of Chocolate bars required to sustain yourself is " + MT ); //if user presses 2, then this happens
			}
				
				
			else if(SEX == 1){
				System.out.println ("FEMALE");
				double BMF = 655 + (4.3 * WEIGHT) + (4.7 * HEIGHT) - (6.8 * AGE);
				System.out.println ("The total amount of calories required to sustain weight " + BMF);
				double FT = BMF/COCO;
				System.out.println ("total number of Chocolate bars required to sustain yourself is " + FT); // if user presses 1, female code happens
							}
				
				
			else { 
					System.out.println ("this program processes data for a man or a woman only"); // default of my if else statement
	
				}
	}
}
