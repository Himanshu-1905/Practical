
class Base {
	int base_salary=30000;
}
class Derived1 extends Base{
	int Bonus = 5000;
}
class Derived2 extends Derived1{
	int ha=2000;
	void show() {
		System.out.println("Salary is :"+base_salary);
		System.out.println("Bonus is :"+Bonus);
		System.out.println("Housing allowance :"+ha);
		System.out.println("Net Salary is :"+base_salary+" +"+Bonus+" +"+ha+" = "+(base_salary+Bonus+ha));
	}
}
public class MultiLevelEg{
	public static void main(String[] args) {
		Derived2 child = new Derived2();
		child.show();
	}
}