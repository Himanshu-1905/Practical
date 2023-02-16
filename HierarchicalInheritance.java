
// Hierarchical Inheritance 
class Vehicle{ // parent class A
	void running() {
		System.out.println("Running mode on");
	}
}
class Car extends Vehicle{ // child class 1
	void run() {
		System.out.println("Car run mode on");
	}
}
class Bike extends Vehicle { // child class 2
	void speed() {
		System.out.println("Bike run mode on");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.running();
		b.speed();
		Car c = new Car();
		c.running();
		c.run();
	}
}
