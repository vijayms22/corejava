package Practicelab_Intermeadiat;
import java.util.Scanner;
public class lab_4 {

	public static void main(String[] args) {
				 int A,B,C,D=0,count=0; 
		// A=1;
		//  B=100;
				 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the starting Range : "); 
		  A = sc.nextInt(); 
		 System.out.println("Enter the ending Range : "); 
		 B = sc.nextInt(); 
		  System.out.println("\nThe prime number are:"); 
		  for(C = A; C <= B; C++) 
		  { 
		   for(D = 2; D<=C; D++) 
		   { 
		    if(C%D == 0) 
		     break; 
		   } 
		   if(C==D) 
		   { 
		    System.out.print(D+ " "); 
	}
		   if (D  % 10 == 1)

		   {

		   count++;

		   }

		   }

		   System.out.println("\n1There are " + count + " prime numbers ending with 1.");

		  }}
 
