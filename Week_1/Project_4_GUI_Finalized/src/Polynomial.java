import java.util.Scanner;
/**
   public class Polynomial
{
   private static int Coefficent5,Coefficent4, Coefficent3, Coefficent2, Coefficent1, Coefficent; // the coefficients

   public static final double EPS = 0.0000001;


   public static double polyValue(double x) 
   {
       return ((((((((((Coefficent5 * x) + Coefficent4) * x) + Coefficent3) * x) + Coefficent2) * x) + Coefficent1) *x ) + Coefficent);
   }
   public static void getCoeff(Scanner sc) 
   {
	   //this is user inputs of each Coefficent, need to link to a GUI 
       System.out.println("Please enter the 5th Coefficient");
       Coefficent5 = sc.nextInt();

       System.out.println("Please enter the 4th Coefficient");
       Coefficent4 = sc.nextInt();

       System.out.println("Please enter the 3rd Coefficient");
       Coefficent3 = sc.nextInt();

       System.out.println("Please enter the 2nd Coefficient");
       Coefficent2 = sc.nextInt();

       System.out.println("Please enter the 1st Coefficient");
       Coefficent1 = sc.nextInt();

       System.out.println("Please enter the zero Coefficient");
       Coefficent = sc.nextInt();
   }

   public static double bisection(double lower, double upper)
   {
       if(polyValue(lower) * polyValue(upper) > 0) 
       {
    	   System.out.println("Error!");
           return -1; // this is error
           
       }
  
       double mid = (lower + upper) / 2;
  
       while(Math.abs(polyValue(mid)) > EPS) 
       {
           if(polyValue(lower) * polyValue(mid) < 0)
           {
               upper = mid;
           }
           else 
           {
               lower = mid;
           }
           		mid = (lower + upper) / 2;
       }
       return mid;
   }
   
   **/
   
   //MAIN
   /**
   public static void main(String[] args) 
   {
  
       Scanner sc = new Scanner(System.in);
       getCoeff(sc);

       double lastX = -5.0000001;
       double lastVal = polyValue(lastX);

       for(double x = -5.0000001; x < 5.0000001; x = x + .1) 
       {

           if(lastVal * polyValue(x) < 0) {
               double root = bisection(lastX, x);

               System.out.println("root is " + root);

               lastX = x;
               lastVal = polyValue(x);
           }
       }

       sc.close();

   }
   
}
**/
