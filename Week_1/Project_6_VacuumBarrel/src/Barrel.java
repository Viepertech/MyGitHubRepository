import java.util.Scanner;

public class Barrel {

   private int numberOfApples;

   public static final int MINIIMUM = 0;

   public static final int MAXIMUM = 100;

   public Barrel() {

       numberOfApples = MINIIMUM;

   }

   public void read() {

       Scanner keyboard = new Scanner(System.in);

       int n;

       System.out.print("Enter a number of apples ");

       n = keyboard.nextInt();

       while(!set(n)){

       System.out.print("Enter a number of apples that is between"+

       MINIIMUM +" and "+MAXIMUM + ": ");

       n = keyboard.nextInt();

       }

       this.numberOfApples = n;    

   }

   public boolean set(int n) {

       if (n>=MINIIMUM&& n<=MAXIMUM)

           return true;

       else

           return false;

   }

   public void set(Barrel barrel) {

       this.numberOfApples = barrel.numberOfApples;

   }

   public int get() {

       return this.numberOfApples;

   }

public Barrel add(int nApples) {

   Barrel barrel = new Barrel();

   int n = this.numberOfApples + nApples;

   if(set(n))

       barrel.numberOfApples = n;

       else {

           System.out.print("Exceeds bounds");

           System.exit(0);

       }

   return barrel;

}

public Barrel subtract(int nApples) {

   Barrel barrel = new Barrel();

   int n = this.numberOfApples - nApples;

   if(set(n))

       barrel.numberOfApples = n;

       else {

           System.out.print("Exceeds bounds");

           System.exit(0);

       }

   return barrel;

}

public Barrel multiply(Barrel b) {

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

  

public Barrel divide(Barrel b) {

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

  

  

  

public Barrel add(int nApples) {

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

  

public Barrel subtract(int nApples) {

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

public Barrel multiply(int nApples) {

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

public Barrel divide(int nApples) {

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

  

public boolean equals(Barrel b) {

   if (this.numberOfApples == b.numberOfApples)

       return true;

   else

       return false;

}

  

public String toString() {

   return "Barrel with "+this.numberOfApples+" apples";
}
}

