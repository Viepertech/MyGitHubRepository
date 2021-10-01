import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Scanner;

/* I have had confusion of how to actually make text Italic.  Currently it is properly setup.
 * Supposedly 
*/
public class Example4 
{
	
	public static void main(String[] args)
	{
		Font myFont = new Font("Courier", Font.ITALIC ,20);
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("What is your favorite food?");

		String food = scanner.nextLine().toUpperCase();

		System.out.print("Enter the first name of friend or relative:");

		String relative = scanner.nextLine().toUpperCase();

		System.out.print("Enter your favorite animal:");

		String animal = scanner.nextLine().toUpperCase();

		System.out.print("What is your favorite color?");

		String color = scanner.nextLine().toUpperCase();
		

		System.out.println("I had a dream that " + relative + " ate a " + color + " " + animal);
		System.out.println("and said it tasted like " + food + "! ");
		
	}
}
//\033[3mrelative\033[0m
        //            \033[3mcolor\033[0m    
        //                             \033[3manimal\033[0m
       //                                                \033[3mfood\033[0m