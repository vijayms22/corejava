package Practicelab_Intermeadiat;

import java.util.Scanner; 

public class lab_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b=0;
		
		{
			System.out.println("enter the numbers :: ");
		a = sc.nextInt();
		
		}
		while( a !=0)
		{
			b=b * 10;
			b=b+ a % 10;
			a=a/10;
		}
System.out.println("the reverse of entered numbers are :: " +b);
}
}