
// how to define a class & field (data members and variables)
public class JavaBatch {
	// defining fields (Instance variable)
	int id;
	String Bname;
	public static void main(String[] args) {
		//
		JavaBatch jb = new JavaBatch();
		JavaBatch jb1 = new JavaBatch();
		//print value
		jb.id=1;
		jb.Bname="Himanshu";
		jb1.id=2;
		jb1.Bname="Jatin";
		System.out.println(jb.id +" "+ jb.Bname);
		System.out.println(jb1.id +" "+ jb1.Bname);
	}
	}


