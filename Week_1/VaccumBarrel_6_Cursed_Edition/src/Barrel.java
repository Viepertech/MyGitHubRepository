import java.util.Scanner;

public class Barrel
{
    private int numberOfApples;

    public static final int MINIMUM = 0;
    public static final int MAXIMUM = 10000;
    // default constructor
    public Barrel() 
    {
        numberOfApples = MINIMUM;
    }

    public void read()
    {
        Scanner console = new Scanner(System.in);
        int n;

        System.out.print("Enter Number of Apples: ");
        n = console.nextInt();

// check MINIMUM, MAXIMUM bounds
        this.numberOfApples = n;
    }

    public void set(Barrel barrel) 
    {
        this.numberOfApples = barrel.numberOfApples;
    }
    public void set(int n)
    {
        numberOfApples=n;
        if(numberOfApples<MINIMUM || numberOfApples> MAXIMUM)
            System.exit(0);
    }

    public int get() 
    {
        return this.numberOfApples;
    }
    public Barrel add(Barrel b) 
    {
        Barrel barrel = new Barrel();
        int n = this.numberOfApples + b.numberOfApples;
        if (n>=MINIMUM && n<=MAXIMUM)

            barrel.numberOfApples = n;
        else 
        {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }
        return barrel;

    }
    public Barrel subtract(Barrel b)
    {
        Barrel barrel = new Barrel();
        int n = this.numberOfApples - b.numberOfApples;
        if (n>=MINIMUM && n<=MAXIMUM)

            barrel.numberOfApples = n;
        else
        {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }
        return barrel;
    }
    public Barrel multiply(Barrel b) 
    {
        Barrel barrel = new Barrel();
        int n = this.numberOfApples * b.numberOfApples;
        if (n>=MINIMUM && n<=MAXIMUM)

            barrel.numberOfApples = n;
        else 
        {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }
        return barrel;
    }
    public Barrel divide(Barrel b) 
    {
        Barrel barrel = new Barrel();
        int n = this.numberOfApples / b.numberOfApples;

        if (n>=MINIMUM && n<=MAXIMUM)

            barrel.numberOfApples = n;
        else
        {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }

        return barrel;
    }
    public Barrel add(int nApples) 
    {
        Barrel barrel = new Barrel();

        int n = this.numberOfApples + nApples;

        if (n>=MINIMUM && n<=MAXIMUM)
            barrel.numberOfApples = n;
        else 
        {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }

        return barrel;
    }
    public Barrel subtract(int nApples) 
    {
        Barrel barrel = new Barrel();

        int n = this.numberOfApples - nApples;

        if (n>=MINIMUM && n<=MAXIMUM)
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

        if (n>=MINIMUM && n<=MAXIMUM)
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

        if (n>=MINIMUM && n<=MAXIMUM)
            barrel.numberOfApples = n;
        else {
            System.out.print("Result exceeds set bounds");
            System.exit(0);
        }
        return barrel;
    }
    public boolean equals(Barrel b) {
        return this.numberOfApples == b.numberOfApples;
    }
    public String toString() {
        return "Barrel with "+this.numberOfApples+" apples";
    }
}