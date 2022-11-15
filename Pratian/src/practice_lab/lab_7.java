package practice_lab;

public class lab_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static void main(String[] args) {
			
			String str = " this is a bueatiful world";
			
		//	str = str.toUpperCase();// for upper case
			
			
			
			for (int i=1 ; i < str.length(); i++)
			{
			if(str.charAt(i) != ' ' )
			System.out.print(str.charAt(i));
			else
			System.out.println();
			}
	}

}
