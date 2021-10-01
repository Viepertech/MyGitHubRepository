package test;

public class Test {
	public static void main(String[] args) {
		/*
		 * Question 1
int x = 9;

if(x > 5) {
	System.out.print("A");
	if(x < 10)
		System.out.println("B");

}
else
	System.out.println("C");
}
*/ 
		/*
		 // Question 2
		int sum = 0, I, J;
		I = 1;
		while(I * I < 10)
		{
			J = I;
	 		while(J * J < 100)
			{	
			  sum = I + J;
			  System.out.println(I + " " + J + " " + sum); 
			  J = J * 2;
			}
			I++;
		}

		*/
		
		/* 
		 * Question 3
		 
		int value = -1, top = 4, n;
		for (n = value; n <= top; n++)
		{
			switch(n)
			{
			case 1:
				System.out.println("One.");
				break;
			case 3:
				System.out.println("Three.");
				break;
			default:
				System.out.println("Default case.");
				break;
			}
	}
*/
		/* 
		 * Question 5
		 
		int P, Q;
		int[][] array = new int[5][5];
		for(P = 1; P <= 4; P++)
		{ 
for(Q = 1; Q <= 4; Q++)
      	  	{
      	 		array[P][Q] = P * Q;
      	   		System.out.print ( array[P][Q]  + " ") ;
        		}
        		System.out.println();
		}
		*/
		
//public Test test
{
	
}
public class Purchase {

private int age;
private boolean old;
private double groupprice;

private Purchase(){

}

private Purchase(int age,int groupprice){
this.age = age;
this.groupprice = groupprice;
}

private void updateGroupPrice(){
if(age>5 && !old){
old=true;
groupprice=groupprice*0.5;
}
}

public boolean olderThan(Purchase p){
p = new Purchase();
if(p.age>this.age){
return true;
}else{
return false;
}
}

public static void main(String[] args) {
Purchase purchase = new Purchase(3,50);

System.out.println("Is purchase is old? "+purchase.olderThan(purchase));
purchase.updateGroupPrice();
System.out.print("Age:"+purchase.age);
System.out.println(" Group price:"+purchase.groupprice);


purchase.age=7;//updating age
purchase.updateGroupPrice();//updatinf value of group price
System.out.println("New Age:"+purchase.age+" New Group Price:"+purchase.groupprice);
}
}
		
		
	
	}
}