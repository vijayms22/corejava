package Practicelab_Intermeadiat;
import java.util.Scanner;
import java.util.Arrays;

public class lab_2 {

	public static void main(String[] args) {
		
		//public class intermediatelab_2 {
		// public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  int n,result,y;
		  int[] array = new int[10];
		             System.out.print("enter limit: ");
		       n = sc.nextInt();
		       System.out.print("list : ");
		       for(int i=1; i<= n; i++)
		         {
		            array[i] = sc.nextInt();
		         }
		            System.out.println("finding: ");
		         y = sc.nextInt();
		        result = Arrays.binarySearch(array, y);
		            if(result<0) {
		                System.out.println("number not found ");
		            }
		            else
		            {
		                System.out.println("number found " + result);
		            }
		 }
		

				}