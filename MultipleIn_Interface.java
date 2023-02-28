
// multiple Inheritance - more than one parent class/ interface
interface Employee{//parent Interface 1
	void salary(); // abstract method salary for parent interface 1
}
interface Developer{// parent interface 2
	void bonus(); // abstract method salary for parent interface 1
}
class Trainer implements Employee,Developer{
	
	@Override
	public void Bonus() {
		System.out.println("Bonus will be 10% of salary");
	}

	@Override
	public void salary() {
		System.out.println("Salary incremented");
	}
}
public class MultipleIn_Interface {
	public static void main(String[] args) {
		Trainer obj = new Trainer();
		obj.Bonus();
		obj.salary();
	}
}
