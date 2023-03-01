
// We can read only (only getter method)
public class Read_Encap {
	private String name = "Himanshu";
	// getting the name
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Read_Encap obj = new Read_Encap();
		// obj.set_name("Jatin"); // We cann't change the value of the name
		System.out.println(obj.name);
	}
}
