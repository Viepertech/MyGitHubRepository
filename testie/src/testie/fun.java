package testie;

public class fun {
	
	
	static int fun(int x, int y) {
		if(x == 0)
			return y;
		return fun(x-1,x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			System.out.println(fun(5,4));
	}

}
