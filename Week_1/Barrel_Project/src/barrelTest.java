//This program takes a value of apples and manipulates it.
//user inputs an interger between MINIMUM and MAXIMUM values
//program should specify 5 separate "barrels" and determining if they are equal
import java.util.Scanner;

public class barrelTest 
{
   private int numberOfApples;
  
   public static final int MINIIMUM = 0;
   public static final int MAXIMUM = 10000;
  
   // default constructor
   public Barrel() 
   {
       numberOfApples = MINIIMUM;
   }
  
   public void read() {
       Scanner console = new Scanner(System.in);
       int n; //n = int
      
       System.out.print("Enter Number of Apples: ");
       n = console.nextInt();
      
       // check MINIMUM, MAXIMUM bounds
       while(n<MINIIMUM && n>MAXIMUM) //while(!set(n)) is incorrect, replace it with this while(n<MINIIMUM && n>MAXIMUM) FOR ALL SET METHODS
       {
       System.out.print("Enter Number of Apples between"+
       MINIIMUM +" and "+MAXIMUM + ": ");
      
       n = console.nextInt();
       }
      
       this.numberOfApples = n;
      
   }
  
   // check MINIMUM, MAXIMUM bounds
   public boolean set(int n) //should be a void method
   {
       if (n>=MINIIMUM && n<=MAXIMUM)
           return true;
       else
           return false;
   }
  
   public void set(Barrel barrel) 
   {
       this.numberOfApples = barrel.numberOfApples;
   }
  
   public int get() {
       return this.numberOfApples;
   }
  
  
   public Barrel add(Barrel b) {
       Barrel barrel = new Barrel();
       int n = this.numberOfApples + b.numberOfApples;
       if (set(n)) // check MINIMUM, MAXIMUM bounds
           barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
       return barrel;
  
   }
public Barrel subtract(Barrel b) 
	{
       Barrel barrel = new Barrel();
       int n = this.numberOfApples - b.numberOfApples;
       if (set(n)) // check MINIMUM, MAXIMUM bounds
           barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }     
       return barrel;
  
	}
public Barrel multiply(Barrel b) 
	{
       Barrel barrel = new Barrel();
       int n = this.numberOfApples * b.numberOfApples;
       if (set(n)) // check MINIMUM, MAXIMUM bounds
           barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
       return barrel;
	}
  
public Barrel divide(Barrel b) 
	{
       Barrel barrel = new Barrel();
       int n = this.numberOfApples / b.numberOfApples;
       if (set(n)) // check MINIMUM, MAXIMUM bounds
           barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
                
       return barrel;
  
	}
  
  
  
public Barrel add(int nApples) 
	{
   Barrel barrel = new Barrel();
  
   int n = this.numberOfApples + nApples;
   if(set(n)) // check MINIMUM, MAXIMUM bounds
       barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
  
   return barrel;
	}
  
public Barrel subtract(int nApples) 
	{
   Barrel barrel = new Barrel();
  
   int n = this.numberOfApples - nApples;
   if(set(n)) // check MINIMUM, MAXIMUM bounds
       barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
   return barrel;
  
	}
public Barrel multiply(int nApples) 
	{
   Barrel barrel = new Barrel();
  
    int n = this.numberOfApples * nApples;
   if(set(n)) // check MINIMUM, MAXIMUM bounds
       barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
   return barrel;
	}
public Barrel divide(int nApples) 
	{
   Barrel barrel = new Barrel();
  
   int n = 0;
  
   if (nApples>0)
       n = this.numberOfApples / nApples;
       else {
           System.out.print("Cannot divide by zero");
           System.exit(0);
       }
  
   if(set(n)) // check MINIMUM, MAXIMUM bounds
       barrel.numberOfApples = n;
       else {
           System.out.print("Result exceeds set bounds");
           System.exit(0);
       }
   return barrel;
	}
  
public boolean equals(Barrel b)
	{
   if (this.numberOfApples == b.numberOfApples)
       return true;
   else
       return false;
	}
  
public String toString() 
	{
   return "Barrel with "+this.numberOfApples+" apples";
	}
  
  
public static void main(String[] args)
	{
   Barrel b1 = new Barrel();
   Barrel b2 = new Barrel();
   Barrel b3 = new Barrel();
   Barrel b4 = new Barrel();
   Barrel b5 = new Barrel();
   //
   b1.read();
   System.out.println("b1 is a "+b1.toString());
   //
   b3 = b1.multiply(2);
   b2 = b3.add(b1);
  
   System.out.println("b2 is a "+b2.toString());
   System.out.println("b3 is a "+b3.toString());
   //
   b4 = b2.subtract(b1);
   System.out.println("b4 is a "+b4.toString());
   //
   b5 = b4.divide(2);
   System.out.println("b5 is a "+b5.toString());
   //
   System.out.print("b5 is");
   if(!b5.equals(b1))
       System.out.print(" not");
   System.out.print(" equal to b1");
  
	}
  
  
}
