package test;

import java.util.Arrays;

public class Method {
/*
a)	It returns an integer array that has both the values of the first array squared
and the values of the second array multiplied by 10.
b)	For each value of the first array print the value and the value squared on one line. Each line printed has two numbers, the array value and its square.
c)	After the numbers and their squares are printed, the sum of the numbers before they are squared from the first array is printed on the next line with a String telling what it is.
d)	For each value of the second array print the value and the value multiplied by 10 on one line. Each line printed has two numbers, the array value and the value times 10.
e)	After the values are printed, print the sum of this array before it is multiplied by 10. 
*/
	
	public static int[] test(int a[], int b[]) {
		//declaring variables.
		int lngth=a.length + b.length, j=0, arrayTotalSum1=0, arrayTotalSum2=0;
		int temp[]=new int[lngth];
		//my array for a, raised to the power of 2 or multiplied by itself.
		for(int i=0;i<a.length;i++) 
		{
			System.out.println(a[i]+" "+a[i]*a[i]);
			arrayTotalSum1 = arrayTotalSum1 + a[i];
			temp[j] = a[i] * a[i];
			j++;
		}
		//printing out array a sum
		System.out.println("The sum of the first array is " + arrayTotalSum1);
		//my array for b, multiply by 10
		for(int i=0;i<b.length;i++) 
		{
			//arrayTotalSum2 = arrayTotalSum2 + b[i];
			System.out.println(b[i]+" "+b[i]*10);
			arrayTotalSum2 = arrayTotalSum2 + b[i];
			temp[j]=b[i]*10;
			j++;
		}
		System.out.println("The sum of the second array is " + arrayTotalSum2);
		return temp;
		
		
	}
	//A main method
	public static void main(String[] arg) 
	{
		System.out.println(Arrays.toString(test(new int[] {2,4,3}, new int[] {1,7})));
	}
}
