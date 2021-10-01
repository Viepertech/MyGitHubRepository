import java.util.Scanner;

public class Chapter4_Q9 
{
	
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of dollars you have: ");
		// variables and user input of dollars.
		int dollars = input.nextInt();
		
		//intial variables
		int chocolate = 0;
		int coupon = 0;
		int moreChocolate = 0;
		chocolate = dollars;
		coupon = chocolate;
		
		//explaining ever chocolate bar gives a coupon. 6 total is required to make a new chocolate bar for free.
		moreChocolate = coupon /6;
		
		while(moreChocolate > 0)
		{
			chocolate += moreChocolate;
			
			coupon -= (6*moreChocolate);
			
			coupon += moreChocolate;
			
			moreChocolate = coupon / 6;
		}
		//display result
		System.out.println("The Total number of Chocolates that can be eaten: " + chocolate);
		
		System.out.println("Remaining Coupons after all purchases: " + coupon);
	}
}
