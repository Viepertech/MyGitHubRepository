public class Temperature 
{
public double temperature;
public char scale;
public Temperature(double temperature, char scale)
{
this.temperature=temperature;
this.scale=scale;
}
public Temperature()
{
	
}

public Temperature toKelvin() ////
{
double converted_Temp;
if(scale == 'C')
{
converted_Temp=(temperature+273.15);
Temperature temp = new Temperature(converted_Temp, 'K');
return temp;
}
if(scale == 'F')
{
converted_Temp=(double)((temperature-32)*5.0/9.0+273.15);
Temperature temp = new Temperature(converted_Temp, 'K');
return temp;
}
if(temperature < 0)
{
System.out.println("K cannot be < 0");
System.exit(0);
}
return this;
}


public Temperature toCelsius()
{
double converted_Temp;
if(scale == 'K')
{
converted_Temp=temperature-273.15;
Temperature temp = new Temperature(converted_Temp, 'C');
return temp;
}
if(scale == 'F')
{
converted_Temp=(double)((temperature-32)*5.0/9.0);
Temperature temp = new Temperature(converted_Temp, 'C');
return temp;
}
if(temperature < -273.15)
{
System.out.println("C cannot be < -273.15");
System.exit(0);
}
return this;
}


public Temperature toFahrenheit()
{
double converted_Temp;
if(scale == 'K')
{
converted_Temp=(double)(temperature -273.15)*9.0/5.0+32;
Temperature temp = new Temperature(converted_Temp, 'F');
return temp;
}
if(scale == 'C')
{
converted_Temp=(double)(temperature*9.0/5.0 +32);
Temperature temp = new Temperature(converted_Temp, 'F');
return temp;
}
if(temperature < -459.67)
{
System.out.println("F cannot be < -459.67");
System.exit(0);
}
return this;
}

public Temperature add(Temperature n)
{
Temperature temp1 = this.toKelvin();
Temperature temp2 = n.toKelvin();
return new Temperature(temp1.temperature+temp2.temperature, 'K');
}

public Temperature subtract(Temperature n)
{
Temperature temp1 = this.toKelvin();
Temperature temp2 = n.toKelvin();
return new Temperature(temp1.temperature-temp2.temperature, 'K');
}

public Temperature multiply(Temperature n)
{
Temperature temp1 = this.toKelvin();
Temperature temp2 = n.toKelvin();
return new Temperature(temp1.temperature*temp2.temperature, 'K');
}

public Temperature divide(double d)
{
Temperature temp1 = this.toKelvin();
double new_temp=(double)(temp1.temperature/d);
return new Temperature(new_temp, 'K');
}

public boolean equals(Temperature n)
{
return this.temperature==n.temperature&&this.scale==n.scale;
}

public String toString()
{
return "Temperature{" + "temperature=" + temperature + "scale=" + scale + '}';
	}
		public void read()
		{
			System.out.println(this);
		}
}