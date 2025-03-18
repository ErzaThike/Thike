package strings;
import java.util.Scanner;
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter a string: ");
String input = s.nextLine();


String result = input.replaceAll("[bB]", "you").toUpperCase();


System.out.println("Modified string: " + result);

s.close();
}

	}


