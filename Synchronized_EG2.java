
public class Sthred_Test { // class 1
	synchronized void display(int num) { // synchronized method
		for(int i=1;i<5;i++) {
			System.out.println(num+1);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class Synchronized_EG2{ // main class
	public static void main(String[] args) {
		final Sthred_Test obj = new Sthred_Test(); // created obj of Sthred_Test class
		
		// 1st thread object t1
		Thread t1 = new Thread() {
			public void show() {
				obj.display(2);
			}
		};
		// 2nd thread object
		Thread t2 = new Thread() {
			public void show() {
				obj.display(5);
	}
};
t1.start();
t2.start();
}
}
