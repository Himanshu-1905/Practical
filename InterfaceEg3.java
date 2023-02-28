
interface ParentInterface{ // parent interface
	void show(); // by default abstract method
	default void print() { // java 8 onward
		System.out.println("Default method");
	}
	static void display() { // java 8 onward
		System.out.println("Static method");
	}
}
class InterfaceEg3 implements ParentInterface{ //  class implements Interface)
	@Override
	public void show() {
		System.out.println("Parent interface method");
}
	public static void main(String[] args) {
		InterfaceEg3 obj = new InterfaceEg3();
		obj.show(); // Override abstract method
		obj.print();
		ParentInterface.display(); // static method
	}
}
