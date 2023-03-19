
import java.util.regex.Pattern;

public class RegularEg1 {
public static void main(String[] args) {
	boolean b7 = Pattern.matches("[A-Za-z0-9+@+.]{18,}","Pallabi.Anudip@2023"); 
			System.out.println(b7);
}
}
