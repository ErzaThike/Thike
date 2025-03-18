package strings;
import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
	System.out.println("Enter your full name");
	String fullname =s.next();
	
	String[] nameParts = fullname.split(" ");
    StringBuilder initials = new StringBuilder();
    
    for (String part : nameParts) {
        if (!part.isEmpty()) {
            initials.append(part.charAt(0));
            
    System.out.println("Your initials are" + initials.toString().toUpperCase());
    
    s.close();
        }
    }
	}

}
