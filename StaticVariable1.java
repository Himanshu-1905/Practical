
class StaticVariable1 { // class 1
public static void main(String[] args) {
	}
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college = "GU"; // static variable
	//static void change(){
	// college = "GU";
	// constructor
	StaticVariable1(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//user defined method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class StaticVariable { // class 2
		public static void main(String[] args) {
			// StaticVariable.change();
			// objects
			StaticVariable1 s1 = new StaticVariable1(1,"Himanshu",1500);
		    StaticVariable1 s2 = new StaticVariable1(2,"Jatin",2000);
		    s1.display(); // method call
		    s2.display();
			}
	}
	}
