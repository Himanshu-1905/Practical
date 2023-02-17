
class SIparent{//parent class
	int salary = 30000; //parent class member
}
// child class of SIparent & parent of MultilevelExample
class SIchild extends SIparent{
	int bonus = 1500; // child class variable
	int annualsal = salary + bonus;
}
public class MultilevelExample extends SIchild { // main class as child class
	public static void main(String[] args) {
		MultilevelExample object = new MultilevelExample();
		System.out.println("Salary is :"+object.salary);
		System.out.println("Annual salary is :"+object.annualsal);
	}
}
