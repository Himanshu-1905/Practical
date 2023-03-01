
public class Encapsulated_Ex {
	public static void main(String[] args) {
		Person p = new Person(); // creating of the objects of encapsulated person class
		
		p.setName("Himanshu"); // setting value in the name
		p.setAge(21); // setting value in the age
		// getting value of the name and age
		System.out.println("Name is: "+p.getName());
		System.out.println("Age is: "+p.getAge());
	}
}
