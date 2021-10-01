import java.util.*;
import java.util.Scanner;

public class Attmept3Example4Chapter3 {
//cursed. final attempt.'
//sorry professor but I don't understand what you want me to do with your variables, I'm making my own.
	 public static void main(String[] args) 
	 {
		 int month;
		 int day;
		 int year;
		 System.out.println("This program tests whether a date in the form of mm/dd/yyyy is a valid date.");
		    System.out.println("please enter a date in the form mm/dd/yyyy");
		    final Scanner in = new Scanner(System.in);
		    String date=in.next();
		    String monthdayyear[]=date.split("/");
		    
		    boolean isMonth;
		    
		    boolean isDay;
		    
		    boolean isYear;
		    
		    boolean isLeapYear;
		    
		    isLeapYear=false;
		    if(year%4==0 && (!(year%100==0) || year%400==0))
		    {
		    isLeapYear=true;
		    }
		    
		    
		    isMonth=true;
		    		{
		    		if((month>12))
		    			{
		    				isMonth=false;
		    				System.out.println("You have entered an invalid month. Please try again.");
		    				break;
		    			}
		    		else
		    		if((month==4||month==6||month==9||month==11)&&(day<=30)) 
		    			{
		    			
		    				isMonth = true;
		    				
		    			}
		    			else if 
		 
		    		}
		 
		 
		 
		 
	 }
}
