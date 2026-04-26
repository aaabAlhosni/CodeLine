package tasks.month1.sprint1;

/**
 * NameWeaver - Demonstrates string concatenation using the + operator.
 * Combines first name and last name into a full name with a space.
 */
public class NameWeaver {
    public static void main(String[] args) {
        // First name variable
        String firstName = "John";
        // Last name variable
        String lastName = "Doe";
        // Concatenate first name, space, and last name using + operator
        String fullName = firstName + " " + lastName;
        // Print the full name (outputs: "John Doe")
        System.out.println(fullName);
    }
}