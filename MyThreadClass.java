
// With/Without using synchronization
public class MyThreadClass {
	//void print (int num) { //without synchronized method
	synchronized void print(int num) { // with synchronized method
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	MyThreadClass Mt;
	Thread1(MyThreadClass Mt){
		this.Mt=Mt;
	}
	public void run() {
		Mt.print(5);// 5*1 5*2 5*3 5*4 5*5 = 5 10 15 20 25
	}
}
class Thread2 extends Thread{
	MyThreadClass Mt;
	Thread2(MyThreadClass Mt){
		this.Mt=Mt;
	}
	public void run() {
		Mt.print(2); // 2*1 2*2 ..... = 2 4 6 8 10
		
		public class WithoutSynchronization{
			public static void main(String[] args) {
				MyThreadClass obj = new MyThreadClass();
				Thread1 t1 = new Thread1(obj);
				Thread2 t2 = new Thread2(obj);
				t1.start();
				t2.start();
			}
		}
	}
}
