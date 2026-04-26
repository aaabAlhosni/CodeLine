package tasks.month1.sprint1;

/**
 * VariableSwap - Demonstrates swapping values of two variables using a temporary variable.
 * Uses classic three-step swap algorithm to exchange values between a and b.
 */
public class VariableSwap {
    public static void main(String[] args) {
        // Initialize first variable with value 10
        int a = 10;
        // Initialize second variable with value 20
        int b = 20;
        // Display values before swapping
        System.out.println("Before swap: a = " + a + ", b = " + b);
        // Step 1: Store value of 'a' in temporary variable 'temp'
        int temp = a;
        // Step 2: Assign value of 'b' to 'a'
        a = b;
        // Step 3: Assign original value of 'a' (stored in temp) to 'b'
        b = temp;
        // Display values after swapping (a=20, b=10)
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}