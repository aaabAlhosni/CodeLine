package tasks.month1.sprint1;

/**
 * ModuloMagic - Demonstrates the modulo (%) operator to find remainder.
 * Calculates the remainder when one integer is divided by another.
 */
public class ModuloMagic {
    public static void main(String[] args) {
        // First integer (dividend): 17
        int num1 = 17;
        // Second integer (divisor): 3
        int num2 = 3;
        // Calculate remainder using modulo operator (17 / 3 = 5 remainder 2)
        int remainder = num1 % num2;
        // Print the remainder with label (outputs: "Remainder: 2")
        System.out.println("Remainder: " + remainder);
    }
}