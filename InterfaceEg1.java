
interface Shape{
	void shape();
}
class Circle implements Shape{

	@Override
	public void shape() {
		System.out.println("Draw a circle");
	}
}
class Triangle implements Shape{
	
	@Override
	public void shape() {
		System.out.println("Draw a triangle");
	}
}
public class InterfaceEg1 {
	public static void main(String[] args) {
		Shape obj = new Circle();
		obj.shape();
	}
}
