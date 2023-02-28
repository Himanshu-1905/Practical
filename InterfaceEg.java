
interface ParentInterface{
	void show(); // by default abstract method 
}
class InterfaceEg implements ParentInterface{ // class implements interface 
	@Override
	public void show() {
		System.out.println("Parent Interface method");
	}
	public static void main(String[] args) {
		InterfaceEg object = new InterfaceEg();
		object.show();
	}
}
