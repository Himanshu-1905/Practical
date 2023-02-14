
class SIParentEg2 {
	int salary = 30000; // parent class number
}
public class SIChildEg2 extends SIParentEg2 {
	int bonus = 1500; // child class number
	int annualsal = salary+bonus;
	public static void main(String[] args) {
		SIChildEg2 object = new SIChildEg2();
		System.out.println("Salary is:"+ object.salary);
		System.out.println("Annual Salary is:"+ object.annualsal);
	}
}
