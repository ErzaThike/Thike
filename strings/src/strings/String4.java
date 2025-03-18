package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: full string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Process: find repeated characters or numbers
        findRepeatedCharacters(input);
        
        scanner.close();
    }
    
    public static void findRepeatedCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Print repeated characters or numbers
        System.out.println("Repeated characters or numbers:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
