 import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Worker 
{
	static Scanner sc = new Scanner(System.in);
	static String firstName; 
	static String lastName;
	static int dependent;
	static double hrs,localTax,federalTax,totalDeduction,stateTax,grossWages,weeklyWage,weeklyLocalTax,todayLocalTax,
	currLocalTax,currFedTax,weeklyFedTax,todayFedTax,currStateTax,totalTax,netPay,weeklyStateTax,todayStateTax;
	
	static double totalDed;
	static double hourlyRate;
	static double noOfHours;

	
   private static DecimalFormat df2 = new DecimalFormat("#.##");
   public static void readInput() {
	
		Worker  testWorker = new Worker();
		
		
		
		
//request first name
				System.out.println("First Name? ");
				firstName = sc.next();
//request last name
				System.out.println("Last Name? ");
				lastName = sc.next();
//request number of dependents
				System.out.println("Number of dependents? ");
				dependent = sc.nextInt();
//request hourly rate of income in $
				System.out.println("Hourly rate? ");
				hourlyRate = sc.nextDouble();
//request number of hours worked
				System.out.println("Number of hours worked in a work week? ");
				noOfHours = sc.nextDouble();
//local taxes withheld
				System.out.println("Local tax withheld to date? ");
				currLocalTax = sc.nextDouble();
				//Suggestion, Rename Curr ot currentLocalTax
//federal taxes withheld				
				System.out.println("Federal tax withheld to date? ");
				currFedTax = sc.nextDouble();
//request federal tax withheld to date
				System.out.println("State tax withheld to date? ");
				currStateTax = sc.nextDouble();
				//this.s_Tax;
			//this.f_Tax;
				//this.l_Tax;
				
}
   
private  double calculateIncome() 
{
	if (noOfHours > 40)
	{
		weeklyWage = (40*hourlyRate) + (((noOfHours-40)*hourlyRate)*1.5);
	}
	else 
	{
		weeklyWage = hourlyRate * noOfHours;
	}
	return weeklyWage;
	
	
}

private double calculateFederalTax() 
{ 
	double taxRate;
	double fedTaxMod = calculateIncome() - (dependent * 15);
	
	if (fedTaxMod >= 0 && fedTaxMod <= 20000) {
		taxRate = 0.10;
	}
	else if (fedTaxMod > 20000 && fedTaxMod <= 40000) 
	{
		taxRate = 0.20;
	}	
	else {
		taxRate = 0.30;
	}
	double fedTaxTotal = taxRate * fedTaxMod;	
		return fedTaxTotal;
		
}

private double calculateStateTax() 
{
	double stateRate;
	double stateTax;
	if (calculateIncome() > 0 && calculateIncome() <= 30000) 
	{
		stateRate = 0.05;
	}
	else 
	{
		stateRate = 0.10;
	}
		stateTax = (stateRate * calculateIncome());
		return stateTax;
	
}

private double calculateLocalTax() 
{
	double localTax;
	System.out.println(calculateIncome()+" yearly income ");
	localTax = (calculateIncome() * 0.0115) + currLocalTax;
	if (localTax > 517.50) 
	{
		localTax = 517.50-localTax;
	}
	/**
	if (calculateIncome() < 45000)
	{
		localTax = calculateIncome() * 0.0115;
		
	}
	else {
		localTax =517.50;
		//the 517.5 is 0.0115 or 1.15% * 45000, the maximum allowed for Local Tax.
	}
	**/
	return localTax;
}
//Problem here
   public void calculateData() 
   {
	 // calculateIncome();
	  //calculateLocalTax();
	 // calculateStateTax();
	   
      grossWages = calculateIncome()*52;
      weeklyWage = calculateIncome();
      
      // Change to localTax, stateTax, federalTax.
      localTax =  calculateLocalTax();
      stateTax =  calculateStateTax();
      federalTax =  calculateFederalTax();
     // totalDeduction = localTax + stateTax + federalTax;
      
      weeklyFedTax = federalTax; 
      todayFedTax = weeklyFedTax + currFedTax;
      //the state is wrong???
      weeklyStateTax = stateTax;
      todayStateTax = weeklyStateTax + currStateTax;
      
     // weeklyLocalTax = localTax/52;
     
      
      //todayLocalTax = localTax + (localTax - currLocalTax);
      todayLocalTax = weeklyWage * 0.0115;
      //System.out.println("todayLocalTax is " + todayLocalTax);
      
      weeklyLocalTax = todayLocalTax*52;
      //System.out.println("weeklyLocalTax  " + weeklyLocalTax);
      
      if (weeklyLocalTax > 517.5) 
      {
    	  weeklyLocalTax = todayLocalTax + currLocalTax;
    	 // weeklyLocalTax = (517.5 - currLocalTax);
    	  System.out.println("After weeklyLocalTax " + weeklyLocalTax);
      }
      
      
      totalDeduction = weeklyStateTax+weeklyLocalTax+weeklyFedTax;
      
      netPay = weeklyWage-totalDeduction;
   }
   
//
		public void writeOutput()
		{
			//NumberFormat formatter = NumberFormat.getCurrencyInstance();
			//calling for fist and last name from code.
			System.out.println("Worker:			"+firstName+" "+lastName);
			System.out.println("");
			
			System.out.println("One Week:			"+noOfHours);
			System.out.println("");
			
			System.out.println("Hourly Rate: 		"+hourlyRate);
			System.out.println("");
			
			System.out.println("  	Total for one Week: $"+df2.format(weeklyWage));
			System.out.println("");
			//two tabs for current, yr. To Date is 3ish.
			System.out.println(" 		Current				yr. To Date");
			
			//federal
			System.out.println("Federal:");
			System.out.print(" 		$"+df2.format(weeklyFedTax));
			System.out.print("				$"+df2.format(todayFedTax));
			System.out.println("");
			//state
			System.out.println("State:");
			System.out.print(" 		$"+df2.format(weeklyStateTax));
			System.out.print("				$"+df2.format(todayStateTax));
			System.out.println("");
			//local
			System.out.println("local:");
			System.out.print(" 		$"+df2.format(todayLocalTax));
			System.out.print("				$"+df2.format(weeklyLocalTax));
			System.out.println("");
			System.out.println("");
			
			
			System.out.println("Total Deduction:	$"+df2.format(totalDeduction));
			System.out.println("");
			
			System.out.println("Net Pay:		$" + df2.format(netPay));
			System.out.println("");
			
		}
   
   
		//GetterAndSetter gs = new GetterAndSetter();

   
   
   
   
   
   
   
   
   
   
   //CHANGE TO DOUBLES NO FLOATS.  CAUSING PROBLEMS.
   
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getDependent() {
	return dependent;
}

public void setDependent(int dependent) {
	this.dependent = dependent;
}

public double getHrs() {
	return hrs;
}

public void setHrs(double hrs) {
	this.hrs = hrs;
}
public double gettotalDeduction() {
	return totalDeduction;
}

public void settotalDeduction(Double totalDeduction) {
	this.totalDeduction= totalDeduction;
}
public double todayFedTax() {
	return todayFedTax;
}

public void settodayFedTax(Double todayFedTax) {
	this.todayFedTax= todayFedTax;
}
public double weeklyFedTax() {
	return weeklyFedTax;
}

public void setweeklyFedTax(Double weeklyFedTax) {
	this.weeklyFedTax= weeklyFedTax;
}

public double getLocalTax() {
	return localTax;
}

public void setLocalTax(double localTax) {
	this.localTax = localTax;
}

public double getFedTax() {
	return federalTax;
}

public void setFedTax(double fedTax) {
	this.federalTax = fedTax;
}

public double getStateTax() {
	return stateTax;
}

public void setStateTax(double stateTax) {
	this.stateTax = stateTax;
}

public double getGrossWages() {
	return grossWages;
}
public double getWeeklyWage() {
	return weeklyWage;
}
public void setGrossWages(double grossWages) {
	this.grossWages = grossWages;
}

public double getCurrLocalTax() {
	return currLocalTax;
}

public void setCurrLocalTax(double currLocalTax) {
	this.currLocalTax = currLocalTax;
}

public double getCurrFedTax() {
	return currFedTax;
}

public void setCurrFedTax(double currFedTax) {
	this.currFedTax = currFedTax;
}

public double getCurrStateTax() {
	return currStateTax;
}

public void setCurrStateTax(double currStateTax) {
	this.currStateTax = currStateTax;
}

public double getTotalTax() {
	return totalTax;
}

public void setTotalTax(double totalTax) {
	this.totalTax = totalTax;
}

public double getTotalDed() {
	return totalDed;
}

public void setTotalDed(double totalDed) {
	this.totalDed = totalDed;
}

public double getNetPay() {
	return netPay;
}

public void setNetPay(double netPay) {
	this.netPay = netPay;
}

public double getHourlyRate() {
	return hourlyRate;
}

public void setHourlyRate(double hourlyRate) {
	this.hourlyRate = hourlyRate;
}

public double getNoOfHours() {
	return noOfHours;
}

public void setNoOfHours(double noOfHours) {
	this.noOfHours = noOfHours;
}

public double getlocalTax() {
	return localTax;
}

public void setlocalTax(double localTax) {
	this.localTax = localTax;
}

public double getfederalTax() {
	return federalTax;
}

public void setfederalTax(double federalTax) {
	this.federalTax = federalTax;
}

public double getstateTax() {
	return stateTax;
}

public void setstateTax(double stateTax) {
	this.stateTax = stateTax;
}
   
public double getweeklystateTax() {
	return weeklyStateTax;
}

public void setweeklyStateTax(double weeklyStateTax) {
	this.weeklyStateTax = weeklyStateTax;
}
public double gettodayStateTax() {
	return todayStateTax;
}

public void settodayStateTax(double todayStateTax) {
	this.todayStateTax = todayStateTax;
}
public double gettodayLocalTax() {
	return todayLocalTax;
}

public void settodayLocalTax(double todayLocalTax) {
	this.todayLocalTax = todayLocalTax;
}
	public double getweeklyLocalTax() {
		return weeklyLocalTax;
	}

	public void setweeklyLocalTax(double weeklyLocalTax) {
		this.weeklyLocalTax = weeklyLocalTax;
	
	
}
   
}
