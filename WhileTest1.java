

import java.util.Scanner;

public class WhileTest1 {
	public static void main(String[] args) {
		int sum = 0;
		int number = 0;
		//scanner class
		Scanner sc = new Scanner(System.in); // taking input from user
		System.out.println("Enter the numbers:");
		
		while(true) { //add only positive number (condition)
			number = sc.nextInt();
			if(number<0)break;
			sum+=number; // sum = sum + number
		}
		System.out.println("Sum is:"+sum);
		sc.close();
	}

}
