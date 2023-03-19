
// append() insert() replace() delete() reverse() - mutable class ( string builder & buffer)
public class MutableExamplestring {
public static void my() {
	// string Buffer
	StringBuffer s = new StringBuffer("Hello"); // object of string buffer class
	s.append("World");
	System.out.println("String is : " + s); // HelloWorld
	s.insert(2, "Riya");                 // (int off set, string s)
	System.out.println("Insert is : " + s); // HeRiyalloWorld
	s.replace(1, 3, "Java");  // (beginwith, endswith, string s)
	System.out.println("replace is :" + s); // HJavaiyalloWorld
	System.out.println("capacity is : " + s.capacity()); //21
	// String Builder
	StringBuilder s1= new StringBuilder("World"); 
	s1.replace(1, 3, "java"); // Wjavald
	System.out.println("replace is : " + s1); 
	s1.delete(1, 3);           // Wvald
	System.out.println("delete is : " + s1);
	s.reverse();                // Wvald
	System.out.println("reverse is :" + s1);
}
public static void main(String[] args) {
	my();
}
}
