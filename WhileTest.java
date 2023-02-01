

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		int sum=0;
		int number=0;
		//Scanner class
		Scanner input = new Scanner(System.in); //Take input from user
				System.out.println("Enter the numbers");
		int number1 = input.nextInt();
		while(number>=0) { //
			sum+=number; //sum=sum+number
			System.out.println("Enter the number");
			number = input.nextInt();
		}
		System.out.println("Sum is:"+sum);
		input.close();
	}
}
