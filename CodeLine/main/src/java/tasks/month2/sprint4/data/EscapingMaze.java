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
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printMaze(char[][] maze, int rows, int cols) {
    }

    public static void printspaces(){
    }

    public static void delayTime(long seconds){
    }
}
