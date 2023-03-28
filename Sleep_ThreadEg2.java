
public class Sleep_ThreadEg2 extends Thread  {
public static void main(String[] args) {
	try {
		for(int i=0;i<=5;i++) {
			Thread.sleep(800); //thread sleep will sleep for 800 mill sec
			//Thread.sleep(-800) ; its the exception = when time is negative
			System.out.println(i);
		}}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		}}