
public abstract class M implements A,B  
{
	public M(){

        System.out.println("constructor of class M called");

    }

	public void E()
	{
		System.out.println("Method E called from class M");
	}
	
	public void F()
	{
		System.out.println("Method F called from class M");
	}
	
	public void G()
	{
		System.out.println("Method G called from class M");
	}
	
	public void H()
	{
		System.out.println("Method H called from class M");
	}
	
	
	public abstract void I();

	public abstract void J();
}
