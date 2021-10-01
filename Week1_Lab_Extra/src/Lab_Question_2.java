//Alexander RN Murphy
/*
2. Modify the previous program in such a way that when the number is 8, break from the block.
This Program will be my submission for question 2 for the Week:01 lab:Extra
 */
//import java.math.*; //I didn't know if I needed this so I threw it on, thought it seems unneeded so I will comment it out.

public class Lab_Question_2 
{
	public static void main(String[] args) 
	{
		int[][] a =  {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; ///this is the data I was given to use in this lab.
		
		for (int i = 0; i <= 3; i++)  //index of each array we go from 0, 1, 2, 3.  also the amount of rows (4).
		{
			for (int j = 0; j <= 2; j++) //index of each array we go from 0, 1, 2.  also the amount of columbs (3).
			{
				if (a[i][j] == 8)
					{
						break;
					}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		//When writing the code I put System.out.println() here and it didn't work.  because it was outside of the for i Loop.  instead it was all on one line.
		//I will take this knowledge in for the future, I didn't know that's how it would work.
	}
} //end of class