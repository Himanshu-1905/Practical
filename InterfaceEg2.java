
interface ParentInterface{
	void show(); // by default abstract method
}
class InterfaceEg2 implements ParentInterface{ //class implements Interface
	public void show() {
		System.out.println("Parent Interface method");
	}
	public static void main(String[] args) {
		InterfaceEg2 object = new InterfaceEg2();
		object.show();
	}
}
