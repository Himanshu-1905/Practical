
// 3 ways to initialize object in java - by reference variable , by method , by constructor
    class ObjectEg { // class 2
	// Instance variable
	int id;
	String name;
	}
    class Object{ // main class
    	public static void main(String[] args) {
    		ObjectEg obj = new ObjectEg(); // create object -- obj is our ref variable
    		obj.id=101;
    		obj.name="Himanshu";
    		System.out.println(obj.id+" "+obj.name); // printng members with a white space
    	}
    }