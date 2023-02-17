
//Area of the circle pi*r*r
class Aggregation{ //class 1
	int Square(int r) { // method name square
		return r*r;
	}
}
public class Circle { //class 2
	double pi = 3.14;
	double area(int radius) {//circl class method pi*r*r
		Aggregation ref_var = new Aggregation(); // object
		int psquare = ref_var.Square(radius); //radius*radius
		return pi*psquare; //area
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		double result = c.area(5); // 3.14*5*5
		System.out.println("Area:"+result);
	}
}
