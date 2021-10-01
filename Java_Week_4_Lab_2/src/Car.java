
public class Car  extends Vehicle implements Market
{

	private Color color;
	private int year;
	private String made;
	
	public Car(int year, String made, Color color)
	{
		
		this.year = year;
		this.made = made;
		this.color = color;
		
	}
	
	
	public String getVehicleInfo()
	{
		
		return year + " " + color + " " + made;

	}
	
	public void quote() 
	{
		double price = (year - baseYears) * 1000;
		price = price < 0 ? 0 : price;
		
	
		switch (color) 
		{
	
		case RED:
			price *= 2;
			break;
		
		case GREEN:
			price /= 2;
			break;
		
		case BLUE:
			price = 0;
			break;
		
		}
		
	System.out.println("Based on the information, the car is worth: $"+price);
	}
}
