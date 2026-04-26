package tasks.month1.sprint1;

/**
 * MultiplicationHeader - Displays a formatted header for a multiplication table.
 * Uses tab escape character (\t) to align numbers in columns.
 */
public class MultiplicationHeader {
    public static void main(String[] args) {
        // Top decorative border (45 equal signs)
        System.out.println("=========================================");
        // Centered title for the table
        System.out.println("           MULTIPLICATION TABLE");
        // Bottom decorative border (45 equal signs)
        System.out.println("=========================================");
        // Column headers: numbers 1-10 separated by tabs for alignment
        System.out.println("1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        // Separator line below headers (45 dashes)
        System.out.println("-----------------------------------------");
    }
}