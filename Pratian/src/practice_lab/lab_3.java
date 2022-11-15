package practice_lab;

public class lab_3 {

	public static void main(String[] args) {
		
		
		//public class Main { public static void main(String[] args) 
		{ int a = 20 , b = 50 , c = 30 ;
		if (a >= b && a >= c)
		{
			System.out.println( "Largest number is: " + a); 
		if (b >= c)
		{ 
			System.out.println( "Second largest number is: " + b); }
		else
		{ 
			System.out.println( "Second largest number is: " + c); } }
		else if (b >= a && b >= c) 
		{
			System.out.println( "Largest number is: " + b);
		if (a >= c) 
		{
			System.out.println( "Second largest number is: " + a);
			} 
		else
		{
			System.out.println( "Second largest number is: " + c);
			
		
		} }
		else 
		{
			System.out.println( "Largest number is: " + c); 
		if (a >= b)
		{ 
			System.out.println( "Second largest number is: " + a); 
			}
		else 
		{
			System.out.println( "Second largest number is: " + b);
			} } } }
		

	}
