package tasks.month1.sprint1;

/**
 * CharacterCraft - Demonstrates extracting a character at a specific index.
 * Uses charAt() method to retrieve the character at index 4 (0-based).
 */
public class CharacterCraft {
    public static void main(String[] args) {
        // Declare a String variable containing the word "Learning"
        String word = "Learning";
        // Print the character at index 4 (0-based: L-e-a-r-n-i-n-g, index 4 = 'n')
        System.out.println(word.charAt(4));
    }
}