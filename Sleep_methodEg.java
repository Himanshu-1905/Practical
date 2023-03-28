
public class Sleep_methodEg extends Thread {
public void run() {
	for (int i=0;i<=5;i++) {
		try {
			Thread.sleep(1000); //thread will sleep for 1000 mill sc
		}
		catch(InterruptedException ie) {
			System.out.println(ie);
		}
		System.out.println(i);
		}
	}
public static void mian(String[] args) {
	Sleep_methodEg t = new Sleep_methodEg();
	Sleep_methodEg t1 = new Sleep_methodEg();
	t.start();
	t1.start();
}
}
