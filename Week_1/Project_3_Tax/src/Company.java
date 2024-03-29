//details for the company
import java.text.NumberFormat;
public class Company
{
private float fedTax,stateTax,grossWages,netPay,currFedTax,currStateTax,totalDed;
public float getF_tax()
{
return fedTax;
}
public float getS_tax() 
{
return stateTax;
}
public float getG_wages() 
{
return grossWages;
}
public float getNet_pay() 
{
return netPay;
}
public float getCf_tax() 
{
return currFedTax;
}
public float getCs_tax() 
{
return currStateTax;
}
public float getCt_deduction() 
{
return totalDed;
}
public void collectData(Employee emp, int count)
{
	System.out.println(count);
	for(int j=0 ; j<=count ; j++)
	{
		fedTax = fedTax + emp.getF_tax().get(j);
		
		currFedTax=currFedTax+emp.getCf_tax().get(j);
		
		currStateTax=currStateTax+emp.getCs_tax().get(j);
		
		totalDed=totalDed+emp.getCt_tax().get(j);
		
		stateTax = stateTax + emp.getS_tax().get(j);
		
		grossWages = grossWages + emp.getG_wages().get(j);
		
		netPay = netPay + emp.getNet_pay().get(j);
		
	}
}
//Output that the user will see when testCompany.printData(); is used.  
	public void printData()
	{
		System.out.println("\n\nCurrent Yr. To Date");
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(getCf_tax());
		
		System.out.println("Federal " + moneyString + " $" + getF_tax());
		moneyString = formatter.format(getCs_tax());
		String moneyString1 = formatter.format(getS_tax());
		
		System.out.println("State" + moneyString + " $" + moneyString1);
		moneyString = formatter.format(getCt_deduction());
		
		System.out.println("Total Deductions $" + moneyString );
		moneyString = formatter.format(getG_wages());
		
		System.out.println("Gross Wages " + moneyString);
		moneyString = formatter.format(getNet_pay());
		
		System.out.println("Net pay " + moneyString);
	}
}