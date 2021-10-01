import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeDemo 
{
	
    //method to create a file for storing prime factors
   // public static final String FACTORS_FILE = "factors.txt";
	
    //Idempotency is key!!! 
	
	
	//Stuff to make a Funny Ha ha text file reader
	//File Class
	//filewriter class
	//printwriter class
	
	//File file = new file("factors.txt");   //created a file object called file
	//FileWriter fw = new FileWriter(file);  //Created a FileWriter Object called fw
	//printerWriter pw = new PrintWriter(fw);//Created a PrintWriter object called pw
	
    public static List<Long> printPrimesToFile() throws FileNotFoundException  
    {
        //Part 1
    	//Generate the file;
    	String FACTORS_FILE = "factors.txt";
    	File factors = new File(FACTORS_FILE);
		PrintWriter writer = new PrintWriter(FACTORS_FILE);
    	//designating an ArrayList called primeCheck to store a list of prime factors
    	List<Long> primeArray = new ArrayList<Long>();
    	//Gather user input 
    	Scanner sc = new Scanner(System.in);
    	

        System.out.println("please enter a 10-digit phone number");
        long phoneNumber = sc.nextLong();
    	long n = phoneNumber;
    	int x = 0;
    	//i equals factor in this equation.
    	//List<Integer> primeArray = new ArrayList<Integer>();
        int i = 2;
        while (n % i == 0) 
        {
        	primeArray.add((long) 2);
        	writer.println(2);

            n = n / 2;
            x++;
            //System.out.println("I am not prime detect: " + x);
        }
        i = 3;
        while (i <= Math.sqrt(n)) {
            while (n % i == 0) {
                //System.out.println("Add " + i + " as factor");
                primeArray.add((long) i);
                writer.println(i);	

                n = n / i;
                x++;
               // System.out.println("I am not prime detect: " + x);

            }
            i = i + 2;
        }
        // Anything left as a factor
        if (n > 1) {
           // System.out.println("Add " + n + " as factor");
            primeArray.add(n);
            writer.println(n);	
            //we assume x = 1 for anything can divide by itself.
            //x++;
        }
       // System.out.println(primeArray);
        //a way to determine if it is prime.  If the Array Length is = 1, then it's prime. 
        if (x == 0)
        {
        	System.out.println("The phone number is prime.");
        }
        else if (x > 1){
        	System.out.println("The factors of the phone number " + phoneNumber + " are: " + primeArray);
        }
        /**
        else 
        {
        	//System.out.println("Shit Code");
        }
        **/
        writer.close();
        return primeArray;
        
        
        
    }
    	
    	//re-enable old code
    	/**
            for (long i = 2; (i * i) <= n / i; i++) 
            {
            	System.out.println("This is the value of i " + i);
            	System.out.println("This is the value of n " + n);
                while (n % i == 0) 
                {
                	//the following comments can be enabled if debugging is required
                	System.out.println("n is: "+ n);
                	System.out.println("i is: "+ i);
                    primeArray.add(i);
                    System.out.println("primearray"+ primeArray);
                    writer.println(i);	
                    n = n/i;
                   System.out.println("n's new value is: " + n);
                   
                }
            }
            //confirm if it's prime or not prime.
            if (n > 1) 
            {
            	System.out.println("Imin the if statement loop");
                primeArray.add(n);
                writer.println(n);
                if (primeArray.size() == 1 && )
                {
                System.out.println("The array is: "+ primeArray);
                System.out.println("The phone number provided is a prime number");
                }
                else
                {
                	System.out.println("The phone number provided is a not a prime number");
                	System.out.println("The prime factors of the phone number are: "+ primeArray);	
                }
            }
            else
            {
            	//In the assignment it is not required for this message, if required it can be re-enabled.
            	System.out.println("The phone number provided is a not a prime number");
            	System.out.println("The prime factors of the phone number are: "+ primeArray);
            }
            return primeArray;
        }
    
        **/
    	//end of old code
    	/**for (long i = 1; i<= phoneNumber; ++i) 
    	{
    		if (phoneNumber % i == 0) 
    		{
    			writer.println(i);	
    		 	primeArray.add(i);
    		}
    	
    	}/**
    	
    	
	    
		//designate the file object
    	//Scanner scanFile = new Scanner(FACTORS_FILE);
    	Scanner scanFile = null;
    	try
    	{
    	scanFile = new Scanner(new File(FACTORS_FILE));
    	}
    	
    	catch(FileNotFoundException e)
    	{  System.out.println("Error opening the file " + FACTORS_FILE);
    	   System.exit(0);
    	}
        
		while(scanFile.hasNextLong())
		{
		  primeArray.add(scanFile.nextLong());

		} 
		
		//System.out.println("PrimeArrayContents: "+primeArray);
		//System.out.println("PrimeArraySize: "+primeArray.size());
	
		//determine if number is a prime; if it is not then print out the contents of the arrayList
		if (primeArray.size()==2)
		{
			System.out.println("This phone number is a prime number");
		}
		else 
		{
			System.out.println("The factors of "+ phoneNumber + " are: "+primeArray);
		}
		writer.close();
    		
	}
 	
    	
        //ArrayList<Integer> nums = IntStream.rangeClosed(2, 1000000000)
              //  .boxed().collect(Collectors.toList());
       /** 
        for(int index=0; index < nums.size(); index++) 
        {
            // Remove all numbers which are divisible by current number
            long current = nums.get(index);
            nums = nums.stream().filter(x -> (x == current || x % current != 0)).collect(Collectors.toList());
        }
        
        //Putting prime factors in a list.
        
        PrintWriter writer = new PrintWriter(new File(FACTORS_FILE));
        for(long x: nums) 
        {
            writer.println(x);
        }
        writer.close();
    }
    **/
    
    public static void main(String[] args) throws FileNotFoundException
    {
    	Scanner sc = new Scanner(System.in); 
    	String answer;
    	do
    	{
    		printPrimesToFile();
    		//asking user if they want to do another phone number
    		
    		System.out.println("Would you like to run this program again? Yes or No?");
    		answer = sc.next();
    	}
    	while (answer.equalsIgnoreCase("Yes"));

    }//end of main method

}//end of program
//when you put in 32 it must print out 2 2 2,