package strings;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Problem, not my problem !";
        printReverse(input);
    }
    
    public static void printReverse(String input) {
        
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println();
    }

	}


