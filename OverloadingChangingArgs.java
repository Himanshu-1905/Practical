
public class OverloadingChangingArgs {
	/*static int sum(int a, int b){ // Two parameters/arguments
	 return a + b;}
	 static int sum (int x, int y, int z) { / three arguments
	 return z+y+z;}
	 */
	static int sum (int a, int b) {// integer type arguments
	return a + b;	
	}
	// double type arguments
	static double sum (double a , double b) { // integer type arguments
		return a + b ;
	}
	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(5, 6));
		System.out.println(OverloadingChangingArgs.sum(5.2,6.1));
	}
}
