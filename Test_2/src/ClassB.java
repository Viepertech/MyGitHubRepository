
public class ClassB extends ClassA
{
	protected int a;
	public void show() {
		System.out.println(a);
	}
	public static void main (String args []) {
		ClassB con = new ClassB();
		con.display();
	}
}
