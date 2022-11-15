package practice_lab;

public class lab_8 {

	public static void main(String[] args) {
	

		  {
		        String input = "HeLlo III WoRlD";
		        String output = "";
		        for(int i = 0; i < input.length(); i++)
		        {
		            char c = input.charAt(i);
		            if(c >= 'A' && c <= 'Z')
		            {
		                output = output + (char)(c + 32);
		            }
		            else if(c >= 'a' && c <= 'z')
		            {
		                output = output + (char)(c - 32);
		            }
		            else
		            {
		                output = output + c;
		            }
		        }
		        System.out.println(output);
		    }
		}
	    
	    }
	
	

