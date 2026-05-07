package tasks.month3.sprint55.escpeMaze;

import java.util.ArrayList;
import java.util.Stack;

public class MazeSolver {

//    // oop creating objects of classes
//    MazeLoader maze = new MazeLoader();
//    Position positions = new Position();

    //-------------------------------------------------
    //oop import some varriables from other classes.
    private char[][] array2d = MazeLoader.getArray2d();
    private int startrow = Position.getStartRow();
    private int startColumn = Position.getStartColumn();
    private int exitRow = Position.getExitRow();
    private int exitcolum = Position.getExitcolum();

    // Stack  for (push/pop each open '0')
    // each push or pop will be like {row, col}
    Stack<int[]> stack = new Stack<>();