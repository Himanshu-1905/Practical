
interface New_Employee{ // parent intwerface 1
	void salary();
}
interface New_Developer{//parent Interface 2
	void salary();
}
class New_Trainer implements New_Employee,New_Developer{
	@Override
	public void salary(){
	System.out.println("Salary incremented");
	}
}
public class MultipleIn_Interface_Eg {
	public static void main(String[] args) {
		New_Trainer obj = new New_Trainer();
		obj.salary();
	}
}
