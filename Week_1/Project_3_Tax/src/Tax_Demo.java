import java.util.Scanner;
public class Tax_Demo
{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args)
	{
		Company testCompany = new Company( );
		Employee testEmployee = new Employee();
		int count,dependent;
		String firstName,lastName;
		float hourlyRate,noOfHours,lTax,f_tax,s_tax;
		System.out.println("Enter number of employees:");
		int numberOfEmployees = sc.nextInt();
		for (count = 0; count < numberOfEmployees; count++)
			{
				System.out.println("Enter data for employee number " + count);
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
				hourlyRate = sc.nextFloat();
//request number of hours worked
				System.out.println("Number of hours worked? ");
				noOfHours = sc.nextFloat();
//local taxes withheld
				System.out.println("Local tax withheld to date? ");
				lTax = sc.nextFloat();
//federal taxes withheld				
				System.out.println("Federal tax withheld to date? ");
				f_tax = sc.nextFloat();
//request federal tax withheld to date
				System.out.println("State tax withheld to date? ");
				s_tax = sc.nextFloat();
//request state tax withheld to date
					testEmployee.readInput(firstName,lastName,dependent,hourlyRate,noOfHours,lTax,f_tax,s_tax);
//This uses the array function in. takes it to Employee Class.  
					testEmployee.calculateData(count);

					testEmployee.writeOutput(count);
//Writes the Output in Employee
					testCompany.collectData(testEmployee,count);
//using Employee data it takes it to Company Class
			}

			testCompany.printData();
//prints out company output.
	}
}

