
// 2- refer immediate parent class method
class Shape1{//parent class
	void print() { //parent class method
		System.out.println("Print circle");
	}
}
class Size1 extends Shape1{// child class
	void print() { // same method of parent class (child class method)
		System.out.println("Print triangle");
	}
		void display() { // new method of child class
			System.out.println("print Nothing");
		}
			void show() { // final method
				super.print(); // refer immediate parent method
				display();
				print();
	}
}
public class SuperMethod {
	public static void main(String[] args) {
		Size1 obj = new Size1();
		obj.show();
	}
}
