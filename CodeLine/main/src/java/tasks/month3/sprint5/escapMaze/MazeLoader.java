package tasks.month3.sprint55.escpeMaze;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MazeLoader {

    private static Path mazePath = null;
    private static char[][] array2d = null;    //oop attributes

    //------------------------------------------------------------------------------------
    // method to Load maze.txt
    public static char[][] loadMaze(){
        try {
            mazePath = Path.of(MazeLoader.class.getResource("./maze.txt").toURI());
        } catch (
                URISyntaxException e) {
            throw new RuntimeException(e);
        }

        try {
            String fileContent = Files.readString(mazePath);
            String[] linesOfFile = fileContent.split("\\r?\\n");
            int lineLength = linesOfFile[0].length();

            array2d = new char[linesOfFile.length][lineLength];  // Load it in 2D Array or Array of Arrays