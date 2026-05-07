package tasks.month3.sprint55.escpeMaze;

public class MazeRender {
    public static void main(String[] args) {

        // Load the maze
        MazeLoader.loadMaze();
        char[][] array2d = MazeLoader.getArray2d();
        // oop attributes
        int rows = array2d.length;
        int cols = array2d[0].length;

        boolean solved;

        if (array2d == null) {
            System.out.println("Error: Failed to load maze.");
            return;
        }

//        // Find start '@' and exit 'E'
//        Position position = new Position();     // oop object
//        int[] positions = position.getStartExitPosition();
//
//        if (positions.length < 4) {
//            System.out.println("Error: Could not find start '@' or exit 'E' in maze.");
//            return;
//        }

        // Scan that array for '@' and 'E'