package ControlStatement;

public class DemonEg extends Thread{
public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println("I am Daemon");
	}
	else {
		System.out.println("I am user");
	}
}
public static void main(String[] args) {
	DemonEg t = new DemonEg();
	DemonEg t1 = new DemonEg();
	DemonEg t2 = new DemonEg();
	t.setDaemon(true);
	t1.setDaemon(true);
	t.start();
	t1.start();
	t2.start();
}
}
