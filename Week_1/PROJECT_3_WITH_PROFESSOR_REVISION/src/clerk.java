import java.text.DecimalFormat;

public class clerk {
	double tempFederalCurrent,tempFederalYr,tempStateCurrent,tempStateYr,tempLocalCurrent,tempLocalYr;
	double tempFederaltodayFedTax, totalDeductionEmployer, tempTotalGrossWage, totalGrossWage, netPayEmployer, tempNetPayEmployer;
	double i, grossWages;
	//static String firstName; 
	//static String lastName;
	//static int dependent;
	//static double hrs,localTax,federalTax,totalDeduction,stateTax,grossWages,weeklyWage,weeklyLocalTax,todayLocalTax,
	//currLocalTax,currFedTax,weeklyFedTax,todayFedTax,currStateTax,totalTax,netPay,weeklyStateTax,todayStateTax;
	
	//static double totalDed;
	//static double hourlyRate;
	//static double noOfHours;
	
   private static DecimalFormat df2 = new DecimalFormat("#.##");
   
   Worker worker = new Worker(); 
   
  
   

   
   
   public void colectDataForEmployerReport(Worker worker2)
   {
		
		tempFederalCurrent = tempFederalCurrent + worker.weeklyFedTax;
		tempFederalYr = tempFederaltodayFedTax + worker.todayFedTax;
		
		tempStateCurrent = tempStateCurrent + worker.weeklyStateTax;
		tempStateYr = tempStateYr + worker.todayStateTax;
  
		tempLocalCurrent = tempLocalCurrent + worker.weeklyLocalTax;
		tempLocalYr = tempLocalYr + worker.todayLocalTax;
		
		tempTotalGrossWage = tempTotalGrossWage + worker.grossWages;
		tempNetPayEmployer = worker.getNetPay();

		
		//checking results.

   }

   
   public void printDataForEmployerReport() {
		System.out.println("These are the Employer's Report for Total taxes.");
		System.out.println("Federal: "+df2.format(tempFederalCurrent));
		System.out.println("");
		System.out.println("State: "+df2.format(tempStateCurrent));
		System.out.println("");
		System.out.println("Local: "+df2.format(tempLocalCurrent));
		System.out.println("");
		
		totalDeductionEmployer = tempFederalCurrent + tempStateCurrent + tempLocalCurrent;
		
		totalGrossWage = tempTotalGrossWage;
		
		double netpay = totalGrossWage - totalDeductionEmployer;
		
		System.out.println("");
		System.out.println("          Total Deduction: " + df2.format(totalDeductionEmployer) );
		System.out.println("");
		System.out.println("          Gross Wage: $" + df2.format(totalGrossWage));
		System.out.println("");
		System.out.println("          Net Pay: " + df2.format(netpay));
		
	}
   
   public void netPayEmployer(double netPayEmployer) {
		this.netPayEmployer = netPayEmployer;
	}


	public double netPayEmployer() {
		return netPayEmployer;
	}
   
   
   public void tempTotalGrossWage(double tempTotalGrossWage) {
		this.tempStateCurrent = tempTotalGrossWage;
	}


	public double tempTotalGrossWage() {
		return tempTotalGrossWage;
	}
	//next two edit
	
   public void totalGrossWage(double totalGrossWage) {
		this.totalGrossWage = totalGrossWage;
	}


	public double totalGrossWage() {
		return totalGrossWage;
	}
   public void totalDeductionEmployer(double totalDeductionEmployer) {
		this.totalDeductionEmployer = totalDeductionEmployer;
	}


	public double totalDeductionEmployer() {
		return totalDeductionEmployer;
	}
public double getTempFederalCurrent() {
	return tempFederalCurrent;
}


public void setTempFederalCurrent(double tempFederalCurrent) {
	this.tempFederalCurrent = tempFederalCurrent;
}


public double getTempFederalYr() {
	return tempFederalYr;
}


public void setTempFederalYr(double tempFederalYr) {
	this.tempFederalYr = tempFederalYr;
}


public double getTempStateCurrent() {
	return tempStateCurrent;
}


public void setTempStateCurrent(double tempStateCurrent) {
	this.tempStateCurrent = tempStateCurrent;
}


public double getTempStateYr() {
	return tempStateYr;
}


public void setTempStateYr(double tempStateYr) {
	this.tempStateYr = tempStateYr;
}


public double getTempLocalCurrent() {
	return tempLocalCurrent;
}


public void setTempLocalCurrent(double tempLocalCurrent) {
	this.tempLocalCurrent = tempLocalCurrent;
}


public double getTempLocalYr() {
	return tempLocalYr;
}


public void setTempLocalYr(double tempLocalYr) {
	this.tempLocalYr = tempLocalYr;
}


public double getTempGrossWage() {
	return tempGrossWage;
}


public void setTempGrossWage(double tempGrossWage) {
	this.tempGrossWage = tempGrossWage;
}

public double grossWages() {
	return grossWages;
}


public void grossWages(double grossWages) {
	this.grossWages = grossWages;
}
public static DecimalFormat getDf2() {
	return df2;
}


public static void setDf2(DecimalFormat df2) {
	clerk.df2 = df2;
}


public Worker getWorker() {
	return worker;
}


public void setWorker(Worker worker) {
	this.worker = worker;
}







   
  
   
}
