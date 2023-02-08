
public class ParameterizedCons {
	int age;
	String name;
	// parameterized cons where we have to pass the parameter / arguments
	ParameterizedCons(int a, String n){
		age = a;
		name = n;
	}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		ParameterizedCons obj = new ParameterizedCons(22,"Himanshu");
		ParameterizedCons obj1 = new ParameterizedCons(24,"Jatin");
		obj.show();
		obj1.show();
	}
}
