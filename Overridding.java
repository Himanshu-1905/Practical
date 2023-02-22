
// Method Overriding (1. same name method 2. same parameters 3. Is-A rala
// Creating parent class/super class
class TestOverriding {
	void run() { //method 1 
		System.out.println("Running mode on");
	}
}
// Creating child class / sub class
class Overridding extends TestOverriding{
	// defining same name method as its declared in the parent class 
	void run() { // method 2
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		// creating a object of child class 
		Overridding a = new Overridding();
		a.run();
	}
}
