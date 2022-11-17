package Practicelab_Intermeadiat;
//import java.io.*;
import java.util.Scanner;
public class lab_6 {

	
		
		public static void main(String args[])//throws IOException
		{
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner br = new Scanner(System.in);
			{
		int sum=0,n,i,avg=0;

		System.out.println("enter the  number of elements");
		//n=Integer.parseInt(br.readLine());
	    n= br.nextInt(); 
		int arr[]=new int[n];
		System.out.println("enter the array elements");

		for(i=0;i<arr.length;i++)
		{
		//	arr[i]=Integer.parseInt(br.readLine());
        arr[i]= br.nextInt();
			
		sum=sum+arr[i];
		avg=sum/n;
		}

		System.out.println("avg of all the elements an array :" +avg);
		}
		}
		




	}


