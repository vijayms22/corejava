package practice_lab;
//import java.util.Scanner; 
public class lab_5 {
	 
	 public static void main(String[] args) { 
	//  Scanner sc =new Scanner(System.in); 
	  int A,B,C,D,sum =0; 
	  A=1;
	  B=20;
	  //System.out.println("Enter the starting Range : "); 
	  //A = sc.nextInt(); 
	 // System.out.println("Enter the ending Range : "); 
	 // B = sc.nextInt(); 
	 // System.out.println("\nThe prime number are:"); 
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
	    sum = sum + D; 
	   } 
	  } 
	  System.out.println("\nsum of prime number is:" +sum); 
	   
	   

}}


