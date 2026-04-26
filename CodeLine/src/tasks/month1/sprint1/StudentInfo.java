package tasks.month1.sprint1;

/**
 * StudentInfo - Displays a simple table of student information.
 * Uses tab (\t) and newline (\n) escape sequences for formatted output.
 */
public class StudentInfo {
    public static void main(String[] args) {
        // Table header with column names separated by tabs
        System.out.println("Name\tAge\tGrade");
        // First student record: Name=John, Age=20, Grade=A
        System.out.println("John\t20\tA");
        // Second student record: Name=Sarah, Age=22, Grade=B
        System.out.println("Sarah\t22\tB");
    }
}