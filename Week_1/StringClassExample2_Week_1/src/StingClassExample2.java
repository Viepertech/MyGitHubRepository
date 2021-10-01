import java.lang.Math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StingClassExample2 {
	
	public static void main(String[] args)
	{

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a line of text.");
		String sentence = userInput.nextLine();

		String replace = sentence.replaceFirst("hate", "love");

		System.out.println("I have rephrased that line.");
		
		System.out.println("Your sentence is : " + replace);
	}
}
