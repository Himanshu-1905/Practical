

public class PyramidPattern {
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) { // outer loop (i is printing rows)
			for(int j=1; j<=i; j++) {// inner loop (j is printing columns)
		      System.out.print("*");
		}
	System.out.println(); // new line
	}
}
}

