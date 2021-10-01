//This program will take the words Banana, dresser, grammar, potato, revive, uneven, assess will be run through this program
//For all of the words above we will move the first letter to the end of the word, and then spell the result backwards, you will get the original word back.
//We will make a program to read words and determine whether it has this property in selected words.  Treating uppercase letter as lowercase letter.
import java.util.Scanner;

public class Chapter4_Q2 
{
	 public static void main(String args[]) {

         Scanner keyboard = new Scanner(System.in);

         String arrInput[], input;
         String arrText[] = null, text, text_word, text_remain;
         int i;
//fix the user interface for this program.

         while (true) {
             // Type
        	// Syste,.out.println
             System.out.println("type string: ");
             System.out.println("Type quit to terminate the program");
             input = keyboard.nextLine();
             input = input.toLowerCase();

             // If user type quit, terminate the program
             if (input.compareTo("quit") == 0)
                 break;

             arrInput = input.split(""); // by breaking the input should be kept
                                         // in arrInput (the input array)

             // Send letters to the front to the back of the input (stored
             // separately in the text)
             text_word = input.substring(0, 1); // the beginning of the input
                                                 // text to Back
             text_remain = input.substring(1, input.length()); // from the second
                                                                 // to the last
                                                                 // character of
                                                                 // the input
             text = text_remain.concat(text_word); // merges into the text
             System.out.println(text);
             // break up the text should be kept in arrText (the text array)


             // input (from the back) and text (from the front) to check for format
             String original = text;
             String reverse = new String();
             int length = original.length();

             for (i = length - 1; i >= 0; i--)
                 reverse = reverse + original.charAt(i);

             if (input.equals(reverse))
                 System.out.println("Proper format.");
             else 
                 System.out.println("improper format.");

         }
     }
 }
