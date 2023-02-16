
class MLIParentEg { // parent class
	int salary = 30000;   // parent class member 
}
class MIChildEg1 extends MLIParentEg{
	int bonus = 1500; //child class member
	int annualsal = salary+bonus;
}
class MIChildEg extends MIChildEg1{
	int da = 200;
	int totalsal = annualsal+da;
	
	public static void main(String[] args) {
		MIChildEg object = new MIChildEg();
		System.out.println("Salary is:"+object.salary);
		System.out.println("Annual Salary is:"+object.annualsal);
		System.out.println("Total Salary is:"+object.totalsal);
	}
}