package tasks.month2.sprint4.data;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Stack;

public class EscapingMaze {
    public static void main(String[] args) {
        // ─────────────────────────────────────────────────
        // STEP 1 — LOAD & SHOW MAZE.TXT IN 2D ARRAY .
        // ─────────────────────────────────────────────────
        Path mazePath = null;
        char array2d[][] = null;

        try {
            mazePath = Path.of(EscapingMaze.class.getResource("./data/maze.txt").toURI());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

        try {
            String fileContent = Files.readString(mazePath);
            String[] linesOfFile = fileContent.split("\n");
            int lineLength = linesOfFile[0].length();

            array2d = new char[linesOfFile.length][lineLength];  // Load it in 2D Array or Array of Arrays

            for (int row = 0; row < linesOfFile.length; row++) {
                char[] currRow = linesOfFile[row].toCharArray();
                // System.out.printf("%s\n", linesOfFile[row]);

                for (int col = 0; col < currRow.length; col++) {
                    array2d[row][col] = currRow[col];
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int rows = array2d.length;                                     // total rows of the maze
        int cols = array2d[0].length;

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.printf("%c ", array2d[row][col]);
            }
            System.out.println();
        }


        // ─────────────────────────────────────────
        // STEP 2 — DECLARE START/END POSITION .
        // ─────────────────────────────────────────
        int startrow = 0;
        int startColumn = 0;    //start

        int exitRow = 0;
        int exitcolum = 0;      //exit


        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) {
            }
        }
    }

    public static void printMaze(char[][] maze, int rows, int cols) {
    }

    public static void printspaces(){
    }

    public static void delayTime(long seconds){
    }
}
