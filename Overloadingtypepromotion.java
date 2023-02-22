
public class Overloadingtypepromotion { // class
	void add(int a, double b) { // method 1
		System.out.println(a+b);
	}
	void add(int a, int b,int c) { // method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		Overloadingtypepromotion obj = new Overloadingtypepromotion(); // obj
		obj.add(2,3); // 2nd int value (3) will be promotes to double
		obj.add(10,30,20);
	}
}
// byte - int -- short -- long-float-double
// char -- int - float-doubl-long
//