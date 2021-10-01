import java.util.Scanner;

public class WorkerDemo

{

      static Scanner scan = new Scanner(System.in);

      public static void main(String[] args)

      {
//PARDON me professor I renamed the class to clerk.
           clerk clerk = new clerk ( );

            Worker Worker;

            int  count;

            System.out.println("Enter number of employees:");

            int numberOfWorkers = scan.nextInt();

 

            for (count = 1; count <= numberOfWorkers; count++)

            {

                  Worker = new Worker ();

                  System.out.println("Enter data for worker number " + count);

                  Worker.readInput();

                  Worker.calculateData();

                  Worker.writeOutput( );

                  clerk.colectDataForEmployerReport(Worker);

            }

            clerk.printDataForEmployerReport();

      }
}
//The Employer is used when multiple workers are inputed by the user.  It allows us to rerun the for loop for each worker.
//The Employer adds all the Data from worker to the employers totals for every worker data inputed.