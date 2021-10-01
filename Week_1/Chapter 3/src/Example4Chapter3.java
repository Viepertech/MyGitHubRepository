import java.util.Scanner;
//code found online
public class Example4Chapter3

{

public static void main(String [ ] args)

{
    
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the date in mm/dd/yyyy format. ");
    String date = keyboard.nextLine();
    
    //split the input date to month,day,year parameters
    String[] strArray = date.split("/");
    strArray[0] = month;
    strArray[1] = day;
    strArray[2] = year;
    
    //Split month into two variables
    String[] month_part = month.split()
    month_part[0] = 

    int mm = 00;

    int dd = 00;

    int yyyy = 0000;

    date = keyboard.nextLine();

    boolean isLeapYear;
    isLeapYear=false;
    if(yyyy%4==0 && (!(yyyy%100==0) || (yyyy%100==0) && yyyy%400==0))
    {
    isLeapYear=true;
    }

    if((mm<12) && (mm>1))
      {
       System.out.println("You have entered an invalid month. Please try again.");
      }

      if((dd>31 && dd<1))
      {
       System.out.println("You have entered an invalid day. Please try again.");
      }

      if((mm==9 && mm==4 && mm==6 && mm==11) && !(dd==31))
      {
       System.out.println("For the given month, you have entered an invalid day.");
      }
      if((mm==2 && !(dd<29)) && isLeapYear==false)
      {
        System.out.println("You have entered an invalid day for the month of February.");
      }
      if((mm==2 && !(dd<30)) && isLeapYear==true)
      {
       System.out.println("You have entered an invalid day for the month of February.");
      }
      else
      {
       System.out.println("You have entered a valid date in the correct format.");


            }


           if (isLeapYear){
           if((mm==2 && !(dd==29)) && isLeapYear==true)
            System.out.println(date + " is a valid date.");
           }
           else
               System.out.println( date + "is not valid month must have 29 days or less.");
            if ((mm ==2) && (dd<=28))
                System.out.println( date + "  is a valid date.");

            }
}
