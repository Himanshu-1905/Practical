
// only 1st excption will execute (multiple catch)
public class MultiCatch {
static void myFunc() {
	try {
		int i =50/0; // Arithmetic
		System.out.println(i); //Arithmetic
		int arr[] = new int [3]; // Arrayindexoutofbound
		arr[7] = 24;
	}
	catch(ArithmeticException e) {
		System.out.println("only 1st Arithmetic exception will execute");
	}
	catch (ArrayIndexOutOfBoundsException ae) {
		System.out.println("Now Array index out of bound will occure");
	}
	finally {
		System.out.println("I am finally block");
	}
}
public static void main(String[] args) {
	myFunc();
		}
}
