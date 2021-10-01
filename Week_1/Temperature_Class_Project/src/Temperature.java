/**
 * TO DO LIST
 * MAKE UPPER AND LOWER IF ELSE STATEMENTS FOR toCelsius, toKelvin, toFahrenheit.  Specified the 3 illegal values or lower.
 * Personally review how temp is being used. write down the process of data.
 * 
 */

import java.util.Scanner;

public class Temperature 
{
	private double temp;
	private char unit;

	public Temperature(double temp, char unit) 
	{
		this.temp = temp;
		this.unit = unit;
	}
	
	public double getTemp() 
	{
		return temp;
	}
	
	public char getUnit() 
	{
		return unit;
	}
	//Transfering each value to Celsius.  If it's already Celscius it'll just 
	public Temperature toCelsius() 
	{
		double tem = 0;
		if(unit=='C') 
		{
			tem=this.temp;
			System.out.println(tem);
		}
		else if(unit=='K')
		{
			tem = ((temp)-273.15);
		}
		else if(unit=='F') 
		{
			tem=(temp-32)*5.0/9.0;
		}
		if (temp < -273.15) 
		{
			System.out.println("The Temperature "+temp+" Is illegal and below atomic zero.");
			
		}
		Temperature t=new Temperature(tem,'C');
		return t;
	}
	//Transfering Each value to Kelvins.  If it's already Kelvin then it keeps original value.
	public Temperature toKelvin() 
	{
		double tem=0;
		if(unit=='K') 
		{
			temp=this.temp;
		}
		else if(unit=='C') 
		{
			temp = temp+273.15;
		}
		else if(unit=='F') 
		{
			tem=(temp-32)*(5.0/9.0);
		}
		if (temp < 0) //added this code.
		{
			System.out.println("The Temperature "+temp+" Is illegal and below atomic zero.");
		}
		Temperature t=new Temperature(tem,'K');
		return t;
	}
	
	//..like
	//	Switch('C');
	//case:F
	//Case:K
	//Case:C
	//Alright.  I can't even talk this is very annoying.  Thank you zoom Q-Q I'll quit.  I'll try to make it intoa  switch statement instead like you said, maybe I'll get no errors.
	//Transfering every other unit to Fahrenheit.  if F then it's already Fahrenheit it keeps original value.
	public Temperature toFahrenheit()
	{
		double tem = 0;
		if(unit=='F') 
		{
			
			tem=this.temp;
		}
		else if (unit=='C')
		{
			tem = (temp-32)*(9.0/5.0);
			if (temp < -273.15) //I added this Line From my original code wensday.
						{
							System.out.println("The Temperature "+temp+" Is illegal and below atomic zero.");
						}
			
		}
		else if (unit=='K') 
		{
			tem=temp*(9.0/5.0)-459.67;
		}
		if (temp < -459.67) //I added this Line From my original code wensday.
		{
			System.out.println("The Temperature "+temp+" Is illegal and below atomic zero.");
		} //when I added this I get Errors with my Current DATA.  Is there a possible reason? I haven't added Fahrenheit yet for this reason
		Temperature t = new Temperature(tem,'F');
		return t;
	}
	//The Actual Code, it will pull out to_____() from the public's above.
	
	public Temperature add(Temperature temp1) 
	{
		double val=0.0;
		Temperature t=null; //t is the null value.  
		switch(temp1.getUnit())
		{
		//C or c is Celsius, example (Temperature temp1 = new Temperature(100.0, 'C');) will be used and be called here.  it will
		//then go to Celsius() to execute this code.  Breaks if it's Case C.  If it's not C it moves on to K and F and repeats
		//Process, breaking if either are the Unit of measurement defined in Temperature_Demo.
			case'C':
			case'c':
				t=this.toCelsius();
				val=t.getTemp()+temp1.getTemp();
				t=new Temperature(val,temp1.getUnit());
			break;
			
			case'K':
			case'k':
				t=this.toKelvin();
				val=t.getTemp()+temp1.getTemp();
				t=new Temperature(val,temp1.getUnit());
			break;
			
			case'F':
			case'f':
				t=this.toFahrenheit();
				val=t.getTemp()+temp1.getTemp();
				t=new Temperature(val,temp1.getUnit());
			break;
		}
		
	return t;
	//I am having trouble chatting with zoom. ._. However
	}
	
	public Temperature divide(int num) 
	{
		double val=0.0;
		Temperature t=null;
		val=this.temp/num;
		t=new Temperature(val, unit);
		return t;
	}
	
	   public Temperature subtract(Temperature temp2) 
	{
	       double val=0.0;
	       Temperature t=null;
	      //I took the Code on Canvas to complete the Assignment, I decided to add a lowercase and it works.
	       switch(getUnit())
	       {
	       case 'C':
	       case 'c':
	       	{
	           t=temp2.toCelsius();
	          
	           break;
	      	}
	       		case 'F':
	       		case 'f':
	     	 {
	     		 	t=temp2.toFahrenheit();
	      
	     		 	break;
	     	 }
	       		case 'K':
	       		    //So Professor I Added 3 lines of code and I recently got this Error, I was hoping you can assit me.  Also ZOOm isn't working with letting me talk.  THis is quiet annoying and I can't even leave
	       			
	       			//forgot to delete that
	       		
	       	 {

	       		 	t=temp2.toKelvin();
	           		break;
	       	 }
	       }
	
	
	       
	       val=this.getTemp()-t.getTemp();
	       
	       return new Temperature(val,getUnit());
	   }
	   
	   public String toString() 
	   {
	       return temp+""+unit;
	   }

	
	
}
	



