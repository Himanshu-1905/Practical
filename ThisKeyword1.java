
// without/with this Keyword
public class ThisKeyword1 { // class 1 outer class
	// instance variable
	int Id;
	String ename;
	double salary;
	// paramerized constructor
	ThisKeyword1(int id, String ename, double salary){
		Id =Id;
		ename=ename;
		salary=salary;
	}
	// method
	void display() {
		System.out.println(Id+" "+ename+" "+salary);
	}
	public class ThisKeyword{ // main class
		public static void main(String[] args) {
			// objects
			ThisKeyword1 obj = new ThisKeyword1(01,"Himanshu",5000);
			ThisKeyword1 obj1 = new ThisKeyword1(02,"Jatin",6000);
			obj.display();
			obj1.display();
		}
	}
}
