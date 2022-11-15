package practice_lab;

public class lab_10 {

	public static void main(String[] args) {
		int num = 3251;
		int rev = 0;
		while(num> 0) {
			rev = rev + num %10;
			num /= 10;
			
		}System.out.println(rev);

	}

}
