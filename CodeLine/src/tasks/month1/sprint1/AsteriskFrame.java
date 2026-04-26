package tasks.month1.sprint1;

/**
 * AsteriskFrame - Creates a small hollow box using asterisks.
 * The box is 5 characters wide and 4 rows tall with empty interior.
 */
public class AsteriskFrame {
    public static void main(String[] args) {
        // Top border: five asterisks
        System.out.println("*****");
        // Middle row 1: left border, space, right border
        System.out.println("* *");
        // Middle row 2: left border, space, right border
        System.out.println("* *");
        // Bottom border: five asterisks
        System.out.println("*****");
    }
}