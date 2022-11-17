package Practicelab_Intermeadiat;
//import java.io.*;
import java.util.Scanner;
public class lab_8 {
	public static void main(String args[])//throws IOException
	{
	//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	Scanner br = new Scanner(System.in);
		{
	int num,num1,rem,result=0;
	System.out.println("enter the  number");
	//num=Integer.parseInt(br.readLine());
	num = br.nextInt();
	num1 = num;
	while(num1 != 0)
	{
	rem = num1 % 10;
	result+= rem*rem*rem;
	num1/=10;
	}
	if(result==num)
	System.out.println("is an armstrong number");
	else
	System.out.println("not an armstrong number");
	}
	}
	}
