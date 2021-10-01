
public class Test_1 {
	public static int x = 0;
	
	
	public static void method1() {
		x += 20;
		float y = 25.5f;
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
	public static void print() {
		float y = 0;
		System.out.println(x);
		method1();
		System.out.println(x);
		System.out.println(y);
		
		
	}
	public static void main(String[] args) 
	{
		
	print();
	
	}
}
