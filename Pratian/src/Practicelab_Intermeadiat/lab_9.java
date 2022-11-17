package Practicelab_Intermeadiat;
import java.io.*;
public class lab_9 {
	public static void main(String args[])throws IOException
	{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	{
	int a,b,c,small,temp;
	System.out.println("enter the first number");
	a=Integer.parseInt(br.readLine());
	System.out.println("enter the second number");
	b=Integer.parseInt(br.readLine());
	System.out.println("enter the third number");
	c=Integer.parseInt(br.readLine());
	temp=a<b ? a:b;
	small=c<temp ? c:temp;
	System.out.println("smallest number is :" +small);
	}
	}
	}

