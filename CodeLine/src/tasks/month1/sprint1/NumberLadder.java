package tasks.month1.sprint1;

/**
 * NumberLadder - Prints a ladder pattern of numbers from 1 to 5.
 * Each row adds one more number, demonstrating simple output formatting.
 */
public class NumberLadder {
    public static void main(String[] args) {
        // Row 1: single number 1
        System.out.println("1");
        // Row 2: numbers 1 and 2, tab-separated
        System.out.println("1\t2");
        // Row 3: numbers 1, 2, and 3
        System.out.println("1\t2\t3");
        // Row 4: numbers 1 through 4
        System.out.println("1\t2\t3\t4");
        // Row 5: complete ladder 1 through 5
        System.out.println("1\t2\t3\t4\t5");
    }
}