package testie;



p
public class testie 
{

	
	public class void
	
	int data[] = {4,7,9,-8,6};
	int b = 5, c = -6;
	
	boolean mystery(int[] x, int b, int c) {
		if(b>0)
			if (x[b-1] == c)
				return true;
			else
				return mystery(x,b-1,c);
		return false;
			
	}
	
	
}

