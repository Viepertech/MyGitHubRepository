import java.util.*;
import java.util.Scanner;

public class Chapter3PracticeProblem4 {
    
	String inputString;

    char firstCharacterOfMonth,
    SecondCharacterOfMonth;

    char firstCharcterOfDay,
    secondCharcterOfDay;

    char firstCharcterOfYear,
    secondCharcterOfYear,
    thirdCharcterOfYear,
    forthCharcterOfYear;
    
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

    boolean isLeapYear;
    boolean goodDay = true;
    boolean goodMonth = true;
    boolean goodYear = true;

    System.out.println("This program tests whether a date in the form of mm/dd/yyyy is a valid date.");
    System.out.println("please enter a string for a date");
    inputString = scan.nextLine();
    
    if((month>=1 && month<=12)&&(day>=1&&day<=31)) 
	   {
	
		   if((month==4||month==6||month==9||month==11)&&(day<=30)) 
		   {
			   validDate = true;
		   }
	   
		   if((month==1||month==6||month==5||month==8||month==10||month==12)&&(day<=31)) 
		   {
			   validDate=true;
		   }
		   			

}
