import java.util.Scanner;

public class VacuumBarrelDemo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) 
    {
	        int x = 5;
	        VacuumBarrel vBarrel1 = new VacuumBarrel(4, new Temperature(120.0, "C"));
	        VacuumBarrel vBarrel2 = new VacuumBarrel(4, new Temperature(50, "C"));
	        VacuumBarrel vBarrel3 = new VacuumBarrel(27, new Temperature(50.0, "C"));
	        VacuumBarrel vBarrel4 = new VacuumBarrel(12, new Temperature(232.0, "K"));
	        System.out.println("vBarrel1 is " + vBarrel1);
	        // a new method toKelvin() needs to be written in VacuumBarrel class
	        vBarrel1 = vBarrel2.toKelvin();
	        System.out.println("vBarrel2 to Kelvin is " + vBarrel1);
	        vBarrel1.set(new Temperature(100, "C"));
	        vBarrel3.set(new Temperature(212, "F"));
	        System.out.println("Vacuum Barrel vBarrel1 has " + vBarrel1);
	        System.out.println("Vacuum Barrel vBarrel3 has " + vBarrel3);
        if (vBarrel1.equals(vBarrel3)) 
        {
        	System.out.println("These two Vacuum Barrels are equal");
        } else 
        {
        	System.out.println("These two Vacuum Barrels are not equal");
        }
	        vBarrel3 = vBarrel1.add(vBarrel2);
	        System.out.println("vBarrel1 is " + vBarrel1);
	        System.out.println("vBarrel2 is " + vBarrel2);
	        System.out.println("sum of vBarrel1 plus vBarrel2 is " + vBarrel3);
	        vBarrel3 = vBarrel1.subtract(vBarrel2);
	        System.out.println("vBarrel1 is " + vBarrel1);
	        System.out.println("vBarrel2 is " + vBarrel2);
	        System.out.println("vBarrel1 minus vBarrel2 is " + vBarrel3);
	//        vBarrel3 = vBarrel1.multiply(vBarrel2);
	        System.out.println("vBarrel1 is " + vBarrel1);
	        System.out.println("vBarrel2 is " + vBarrel2);
	        System.out.println("vBarrel1 times vBarrel2 is " + vBarrel3);
	//        vBarrel3 = vBarrel1.divideBy(x);
	        System.out.println("vBarrel1 is " + vBarrel1);
	        System.out.println("vBarrel1 divided by " + x + " is " + vBarrel3);
    }//end of main method
}//End of program