import java.util.Scanner;

public class Example4 {
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
    
    //following month into integerValueOfMonth
    integerValueOfMonth = (integerValueOfFirstCharacterOfMonth*10) + integerValueOfSecondCharacterOfMonth;
    //following day into integerValueOfMonth
    integerValueOfDay = (integerValueOfFirstCharacterOfDay*10) + integerValueOfSecondCharacterOfDay;
    //following year into integerValueOfYear
    integerValueOfYear = (integerValueOfFirstCharacterOfYear*1000)+(integerValueOfSecondCharacterOfYear*100)+(integerValueOfThirdCharacterOfYear*10)+integerValueOfForthCharacterOfYear;
    ///finished, moving on two switch statements.
	//debug
   // System.out.println(" " + integerValueOfFirstCharacterOfMonth +" " + integerValueOfSecondCharacterOfMonth + " ");
    {
    	
    	
    	
 //this checks if it is a leap year.  matters if month is Feb.

    }  
    
    	//if((integerValueOfYear%4==0) && !(integerValueOfYear%100==0)||(integerValueOfYear%100==0 && integerValueOfYear%400==0))
	//	{
		//	isLeapYear = true;
	//		System.out.println("It is a leap Year");
	//	}
    //	else 
    	//	isLeapYear = false;
    if (integerValueOfYear % 400 == 0) {
    	isLeapYear = true;
    	  } else if (integerValueOfYear % 100 == 0) {
    		  isLeapYear = false;
    	  } else if (integerValueOfYear % 4 == 0) {
    		  isLeapYear = true;
    	  } else {
    		  isLeapYear = false;
    	  }
    	  if (isLeapYear) {
    	   System.out.println("Year " + integerValueOfYear + " is a Leap Year");
    	  } else {
    	   System.out.println("Year " + integerValueOfYear + " is not a Leap Year");
    	  }
    	 
    	
    	
    	
    	
    	
    	
    	//IF the "integerValueOfMonth" is greater than 12, it's impossible and automatically a false statement.  
    if (integerValueOfMonth > 12) 
    {
    	System.out.println("Invalid month, does not exist.");
    	goodMonth = false;
    }
    // days past 31 is illegal by god
    if (integerValueOfDay > 31) 
    {
    	System.out.println("Invalid Day, does not exist. No day can ever be more than 31");
    	goodDay = false;
    }
    
    //This determines all months with 30 days	
    switch (integerValueOfMonth) {
    case 4:
    	if(integerValueOfDay > 30 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for April: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 6:
    	if(integerValueOfDay > 30 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for June: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 9:
    	if(integerValueOfDay > 30 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for November: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 11:
    	if(integerValueOfDay > 30 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for September: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    }
    
    //This determines all months with 31 days
    switch (integerValueOfMonth) 
    {
    case 1:
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for January: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break; //repeat this format for all, put all month swtiches at the end after day switches.
    case 3:
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for March: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 5:
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for May: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 7: 
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for July: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 8: 
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for August: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 10:
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for October: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    case 12:
    	if(integerValueOfDay > 31 || integerValueOfDay < 1 ) 
    	{
    		System.out.println("Invalid day for December: " + integerValueOfDay);
    		goodDay = false;
    	}
    	break;
    }
    
    switch (integerValueOfMonth) 
    {
    case 2:
    	if ((isLeapYear = false & integerValueOfDay > 28)) 
    	{
    		System.out.println("Invalid day for Feburary, durring a Leap year: " + integerValueOfDay);
    		goodDay = false;
    		break;
    	}
    	else if ((isLeapYear = true) & integerValueOfDay > 29)
    		System.out.println("Invalid day for Feburary, durring a Leap year: " + integerValueOfDay);
			goodDay = false;
			break;
    }
    
    
      		if((goodDay = true))
      				{
    			System.out.println("Day Is Fine");
      		}
    		if(goodMonth = true) {
    			System.out.println("Month Is Fine");
    		}
    		if((goodMonth = true) && (goodDay = true))
    			System.out.println("Code is valid");
    		}
	}
    // boolean goodDay = true;

   // boolean goodMonth = true;

    //boolean goodYear = true;
    		
	
   
