
import java.util.Scanner;
public class StringTest {
	String x = "Hello";
	public void show() {//method
		Scanner s = new Scanner(System.in); // user input
		System.out.println("Enter string"); // line no. 1
		String A = s.next(); // 1st String
		String B = s.next(); // 2st String
		System.out.println(A.length()+B.length());
		System.out.println(A.compareTo(B)>0 ? "yes" : "No"); // compare to ()
		System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+" "+B.substring(0,3).toLowerCase()+B.substring(1));
		// Substring(), upper case, lower case Java
		System.out.println("Substring is:"+x.substring(0,3));
		System.out.println("Substring is:"+x.substring(2));
	}
	public static void main(String[] args) {
		StringTest t = new StringTest();
		t.show();
	}
}
