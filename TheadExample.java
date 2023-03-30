package ControlStatement;
// creating thread by extending thread class
public class TheadExample extends Thread{
	public void run() {
		System.out.println("I am Thread... thread is running");
	}
	public static void main(String[] args) {
		ThreadExample t = new ThreadExample();
		t.start(); // move the thread to the action state
		t.start();
		
		/*t.setName("Himanshu");
		String s = t.getName();
		System.out.println(s);*/
	}
}