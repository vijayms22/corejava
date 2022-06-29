
public class DepositThread {
static int Balance=2000;
	public static void main(String[] args) {
		SynchronizedClass sc=new SynchronizedClass();
		
		DepositThread dt1=new DepositThread();
		DepositThread dt2=new DepositThread();
		
		dt1.start();
		dt2.start();
		try {
			dt1.join();
			dt2.join();
		}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Total balance is"+Balance);
}
	private void join() {
		// TODO Auto-generated method stub
		
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}

}
