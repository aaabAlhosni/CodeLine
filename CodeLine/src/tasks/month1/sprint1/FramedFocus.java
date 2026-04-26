package tasks.month1.sprint1;

/**
 * FramedFocus - Displays a centered message within a decorative asterisk frame.
 * Uses escape sequence \" for quoted text within the output.
 */
public class FramedFocus {
    public static void main(String[] args) {
        // Top border of the frame (23 asterisks)
        System.out.println("***********************");
        // Left border with spacing
        System.out.println("* *");
        // Centered message with quotes (escaped)
        System.out.println("* \"Keep Learning\"   *");
        // Right border with matching spacing
        System.out.println("* *");
        // Bottom border of the frame
        System.out.println("***********************");
    }
}