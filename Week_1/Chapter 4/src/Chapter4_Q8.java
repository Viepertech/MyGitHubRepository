import java.util.Scanner;

public class Chapter4_Q8 
{
	public static void main(String args[]) 
	{
		
			{
			int i = 0;
			int num[] = new int[3];
			//generate 3 random numbers and stores it in a num array.
			
			loop : while(i < 3) 
				{
					num[i] = (int) (Math.random() * 10) + 1;
					i++; //increase i by 1.
				}
			
			if (num[0] == num[1])
				num[1] = (int) (Math.random() * 10) + 1;
			
			if (num[0] == num[2])
			{
				while(num[0]==num[2])
				num[2] = (int) (Math.random() * 10) + 1;
			}
			
			if(num[1] == num[2])
			{
				while(num[1]==num[2])
					num[2] = (int) (Math.random() * 10) + 1;
			}
			
			//display results
			System.out.println("The three selected finalists: ");
			for(int j = 0; j<3;j++)
				System.out.println(num[j]);
			
		}
			
	}
}

