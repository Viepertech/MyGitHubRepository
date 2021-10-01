import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class PrimeFactor 
{
	
 
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        sc.close();
        List<Integer> factors = primeFactors(num);
        System.out.println("The Prime Factors of " + num + " are : " + factors);
 
    }
 
    private static List<Integer> primeFactors(int n) throws FileNotFoundException 
    {
    	//Part 1
    	//Generate the file;
    	String FACTORS_FILE = "factors.txt";
		PrintWriter writer = new PrintWriter(FACTORS_FILE);
    	//designating an ArrayList called primeCheck to store a list of prime factors
    	List<Long> primeArray = new ArrayList<Long>();
    	//Gather user input 
        List<Integer> factors = new ArrayList<Integer>();
        
        for (int factor = 2; factor * factor <= n; factor++) {
 
            // if i is a factor, add it to the list and divide number by i
            while (n % factor == 0) {
                System.out.print(factor + " ");
                factors.add(factor);
                n = n / factor;
            }
        }
        // If there's anything left of the number, it is a factor too
        if (n > 1) {
            factors.add(n);
            System.out.println(n);
        } else
            System.out.println();
        return factors;
    }
}