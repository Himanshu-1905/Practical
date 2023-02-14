
class StaticMethod { // class 1
	//instance variable
	int rollno;
	String name;
	float fee;
	static String college = "GU"; // static variable
	static void change(){
	college = "DSD";}
	// Parameterized constructor
	StaticMethod(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	//user defined method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class StaticMethod1 { // class 2
		public static void main(String[] args) {
			//calling static method with class
			StaticMethod.change();
			// creating objects
			StaticMethod s1 = new StaticMethod(1,"Himanshu",1500);
		    StaticMethod s2 = new StaticMethod(2,"Jatin",2000);
		    s1.display(); // method call
		    s2.display();
			}
	}
	}
