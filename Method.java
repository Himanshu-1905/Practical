
public class Method {
	public static void main(String[] args) {
		int num1=5;
		int num2=4;
		//method calling
		int c=addition(num1,num2);// um1 & num2 parameters
		System.out.println("Sum:"+" "+c);
	}
	// declare the method (user define method)
	public static int addition(int num1, int num2) {
		int sum;
		sum=num1+num2;
		return sum;
	}
}