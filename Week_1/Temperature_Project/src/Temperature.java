/**
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
	
	public void setTemp(double temp)
	{
		
	}
	
	public char getUnit() 
	{
		return unit;
	}
	
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
		Temperature t=new Temperature(tem,'C');
		return t;
	}
	
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
		Temperature t=new Temperature(tem,'K');
		return t;
	}
	
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
		}
		else if (unit=='K') 
		{
			tem=temp*(9.0/5.0)-459.67;
		}
		Temperature t = new Temperature(tem,'F');
		return t;
	}
	//The Actual Code, it will pull out to_____() from the public's above.
	public Temperature add(Temperature temp1) 
	{
		double val=0.0;
		Temperature t=null;
		switch(temp1.getUnit())
		{
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
	       case 'k':
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
	
	