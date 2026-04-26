package tasks.month1.sprint1;

/**
 * InitialImpression - Demonstrates extracting the first character from a string.
 * Uses charAt() method to get the initial (first letter) from a full name.
 */
public class InitialImpression {
    public static void main(String[] args) {
        // Full name variable containing first and last name
        String fullName = "John Doe";
        // Extract first character (index 0) using charAt(0) method
        // This outputs 'J' (the initial)
        System.out.println(fullName.charAt(0));
    }
}