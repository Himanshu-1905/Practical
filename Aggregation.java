
// Area of the circle pi*r*r
class Aggregation { //class 1
	int Square(int r) { // method name square
		return r*r;
	}
}
class circle{ // class 2
	Aggregation ag; //obj (entity ref)
	double pi = 3.14;
	double area(int radius) { // pi*r*r
		ag = new Aggregation();
		int psquare = ag.Square(radius); 
		return pi*psquare;
	}
	public static void main(String[] args) {
		circle c = new circle();
		double result = c.area(5);
		System.out.println(result);
	}
}
