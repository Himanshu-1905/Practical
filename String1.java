
// char[] work same as java string
public class String1 {
	public void Show() { //method 1
		char[] arr = {'j','a','v','a'}; //char type array
		System.out.println(arr);
		String s= new String(arr);
		System.out.println("values is:" +s); //"java"
	}
	public void myfunction() { //method2
		String s1 = "Himanshu chauhan";
		String s2 =new String(s1);
		System.out.println(s2); //Himanshu chauhan
	}
		public static void main(String[] args) {
			String1 str = new String1();
			str.Show();
			str.myfunction();
		}
	}
