
import java.util.Scanner;
public class Method2 {
	public static void main(String[] args) {
		//create scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		//Read numbers from user
		int num = sc.nextInt();
		// Call the method
		primeornot(num);
	}
	//Create a method
	public static void primeornot(int num){
		int count=0;
		for(int i=1; i<=num; i++) {
		if(num%i==0) {
			count++;
		}
		}
		if(count==2) {
			System.out.println(num +" "+"Prime");
		}
		else {
			System.out.println(num +" "+"Non-Prime");
	}
}
}
