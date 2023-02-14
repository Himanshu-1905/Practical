
public class SingleInheritance {
	public static void main(String[] args) {
		SIChild child = new SIChild(); //create a object of
		child.display();
		child.show();
	}
}
class SIParent { // parent class
	void show () { // parent class user defined method
		System.out.println("Show the details");
	}
}
class SIChild extends SIParent{ // child class
	void display() { // parent class user defined method
		System.out.println("Display the result");
	}
}