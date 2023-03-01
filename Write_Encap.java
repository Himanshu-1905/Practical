
public class Write_Encap {
	private String name;
	
	public void setName() {
		this.name=name;
	}
	public static void main(String[] args) {
		Write_Encap obj = new Write_Encap();
		obj.setName();
		//We can not get the value , there is no get method
		//System.out.println("Name: "+obj.getName());
		System.out.println(obj.name);
	}
}
