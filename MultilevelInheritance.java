
public class MultilevelInheritance {
	// main class
	public static void main(String[] args) {
		SIChild2 child = new SIChild2(); //create a object of child
		child.display();
		child.show();
		child.print();
	}
}
class SIParent1 { //parent class
	void show () { // parent class user defined method
		System.out.println("Show the details");
	}
}
// child class of SIParent & parent class of SIChild2
class SIChild1 extends SIParent1 {
	void display() { // child class user defined method
		System.out.println("Display the result");
	}
}
class SIChild2 extends SIChild1 { // child class
	void print() { // child class user defined method
		System.out.println("Print the output");
	}
}