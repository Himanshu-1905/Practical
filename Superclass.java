
// super keyword - reference variable which refer immediate parent class(Superclass,method,constructor)
// 3 usage of super keyword
//1-refer immediate parent class instance variable
// by using super keyword we can uise parent class data member
class Shape{// parent class
	String name = "Circle"; // data member of parent class
}
class Size extends Shape{ // child class
	String name = "No Size"; // data member of child class
	void print () {// child class method
		System.out.println(name); // it represent child class
		System.out.println(super.name); // it represent immediate parent class superclass
	}
}
public class Superclass {
	public static void main(String[] args) {
		Size obj = new Size();
		obj.print();
	}
}
