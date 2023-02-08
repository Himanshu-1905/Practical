
public class DifferentClassName { //class
	int age;
	String name;
	void show() { //method to display age and name (User Defined)
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		//1st object for name & age
		DifferentClassName obj = new DifferentClassName();
		// 2nd object for name & age
		DifferentClassName obj1 = new DifferentClassName();
		obj.show();
		obj1.show();
		DifferentClassName obj2 = new DifferentClassName();
		obj2.age=100;
		obj2.name="Java";
		System.out.println(obj2.age+" "+obj2.name);
	}
}
