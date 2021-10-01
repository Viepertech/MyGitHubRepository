import java.util.Scanner;

public class lisatest {
	public static void main(String[] args) {
	//*** note variable names

    //***  Put one variable on one line.

    //*** note System.out.println statements for debugging

    char firstCharacterOfMonth, SecondCharacterOfMonth;

    char firstCharcterOfDay,secondCharcterOfDay;

    char firstCharcterOfYear, secondCharcterOfYear,thirdCharcterOfYear,forthCharcterOfYear;
//declare integers
    int integerValueOfFirstCharacterOfMonth;
    int integerValueOfSecondCharacterOfMonth;
    int integerValueOfFirstCharacterOfDay;
    int integerValueOfSecondCharacterOfDay;
    int integerValueOfFirstCharacterOfYear;
    int integerValueOfSecondCharacterOfYear;
    int integerValueOfThirdCharacterOfYear;
    int integerValueOfForthCharacterOfYear;
    int integerValueOfMonth;
    int integerValueOfDay;
    int integerValueOfYear;
  
    String StringMonthValue = null;
    // holding values January, or February etc.

    boolean isLeapYear;

    //*** goodDay, goodMonth, and goodYear start out as true.

    boolean goodDay = true;

    boolean goodMonth = true;

    boolean goodYear = true;
    
    System.out.println("This program tests whether a date in the form of mm/dd/yyyy is a valid date.");

    String inputString;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the date in mm/dd/yyyy format. ");
    String date = keyboard.nextLine();
    
    //split the input date to month,day,year parameters
    String[] strArray = date.split("/");
    String month_str=strArray[0];
    String day_str = strArray[1];
    String year_str = strArray[2];
    // change from string to int
    int month = Integer.parseInt(month_str);
    int day = Integer.parseInt(day_str);
    int year = Integer.parseInt(year_str);
    
    
    //Split month into two variables
    String[] month_part = month_str.split("");
    String first_month = month_part[0];
    String second_month = month_part[1];
    
    integerValueOfFirstCharacterOfMonth = Integer.parseInt(first_month);
    integerValueOfSecondCharacterOfMonth = Integer.parseInt(second_month);
    
    //split day into two variables
    String[] day_part = day_str.split("");
    String first_day = day_part[0];
    String second_day = day_part[1];    
    
    integerValueOfFirstCharacterOfDay = Integer.parseInt(first_day);
    integerValueOfSecondCharacterOfDay = Integer.parseInt(second_day);
    
    //split year into four variables
    String[] year_part = year_str.split("");
    String first_year = year_part[0];
    String second_year = year_part[1];
    String third_year = year_part[2];
    String fourth_year = year_part[3];
    
    integerValueOfFirstCharacterOfYear = Integer.parseInt(first_year);
    integerValueOfSecondCharacterOfYear = Integer.parseInt(second_year);
    integerValueOfThirdCharacterOfYear = Integer.parseInt(third_year);
    integerValueOfForthCharacterOfYear = Integer.parseInt(fourth_year);
    ///finished, moving on two switch statements.
	//debug
   // System.out.println(" " + integerValueOfFirstCharacterOfMonth +" " + integerValueOfSecondCharacterOfMonth + " ");
    {
    switch (integerValueOfFirstCharacterOfMonth) {
    case 0:
    	 break;
    case 1: 
    	 break;
    default:
    	goodMonth = false;
    	System.out.println("Invalid Month data provided");
    	break;
    }
    
    switch (integerValueOfSecondCharacterOfMonth) {
    case 0:
    	break;
    case 1:
    	break;
    case 2: 
    	break;
    case 3:
    	break;
    case 4: 
    	break;
    case 5:
    	break;
    case 6:
    	break;
    case 7: 
    	break;
    case 8: 
    	break;
    case 9:
    	break;
    default:
    	goodMonth = false;
    	System.out.println("Invalid Month data provided");	
    	break;
    }
    	//false = true for above.
    switch (integerValueOfFirstCharacterOfYear) { 
    default:
    	goodYear = true; 
    	break;
    }
    switch (integerValueOfSecondCharacterOfYear) { 
    default:
    	goodYear = true; 
    	break;
    }
    switch (integerValueOfThirdCharacterOfYear) { 
    default:
    	goodYear = true; 
    	break;
    }
    switch (integerValueOfForthCharacterOfYear) { 
    default:
    	goodYear = true; 
    	break;
    }
    
    switch (month) {
    	//determine which months have 31 days: January, March, May, July, August, October, December
    	case 1:
    		break;
    	case 2:
    	{
    		if((year%4==0) && !(year%100==0) || (year%100==0) && (year%400==0))
    			if (day > 29)
    				goodDay = false;
    			else
    				goodDay = true;
    		else
    			if (day > 28)
    				goodDay = false;
    			else
    				goodDay = true;  	
    		break;
    	}
    	case 3:
    		break;
    	case 5:
    		break;
    	case 7:
    		break;
    	case 8:
    		break;
    	case 10:
    		break;
    	case 12:
    		if (day > 31)
    			goodDay = false;
    		else
    			goodDay = true;
    		break;
    	//months with 30 days: April, June September, November
    	case 4:
    		if (day > 30)
    			goodDay = false;
    		else
    			goodDay = true;
    		break;   
    	case 6:
    		if (day > 30)
    			goodDay = false;
    		else
    			goodDay = true;  
    		break;
    	case 9: 
    		if (day > 30)
    			goodDay = false;
    		else
    			goodDay = true; 
    		break;
    	case 11:
    		if (day > 30)
    			goodDay = false;
    		else
    			goodDay = true;
    		break;   
    }		
    	//February is special
    	//case 2:
    		//is this a leap year?
    		//if((year%4==0) && !(year%100==0) || (year%100==0) && (year%400==0))
    		//	if (day > 29)
    			//	goodMonth = false;
    		//	else
    		//		goodMonth = true;
    		//else
    		//	if (day > 28)
    			//	goodMonth = false;
    			//else
    			//	goodMonth = true;  	
    	//	break;
    
    		
    		if(goodDay & goodMonth & goodYear)
    			System.out.println("The Code is Valid.");
    		else
    			System.out.println("The Code is Invalid.");
	}
    // boolean goodDay = true;

   // boolean goodMonth = true;

    //boolean goodYear = true;
    		
	}
}    
