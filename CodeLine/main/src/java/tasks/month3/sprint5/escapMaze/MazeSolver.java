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
    ArrayList<int[]> track = new ArrayList<>();

    private int rows = array2d.length;
    private int cols = array2d[0].length;

    // directions: Left, Right, Up, Down  (in that search order)
    int[] dRow = {0, 0, 1, -1};             // row directions
    int[] dCol = {1, -1, 0, 0};             // col directions

    // visited point: true, false
    private boolean[][] visited = null;

    //is the maze solved: true , false
    private boolean solved = false;

    //-------------------------------------------------
    //solving maze
    public void startMaze() {

        //error handling
        if (array2d == null) {
            System.out.println("Error: Maze could not be loaded.");
            return;
        }

//        // oop import Start/exit Varriables
//        int[] listOfPositions = positions.getStartExitPosition(array2d);
//        //error handling
//        if (listOfPositions.length < 4) {
//            return;
//        }
//        int startrow = listOfPositions[0];
//        int startColumn = listOfPositions[1];
//        int exitRow = listOfPositions[2];
//        int exitcolum = listOfPositions[3];

//        public int[] startposition(){
//            int startrow
//        }

        // Update visited point
        visited = new boolean[rows][cols];

        // -----------------------------------------------
        // STEP 4 — PUSH START AND UPDATE CURRENT POSITION
        stack.push(new int[]{startrow, startColumn});  // push '@' position onto stack
        visited[startrow][startColumn] = true;          // mark start as visited
        track.add(new int[]{startrow, startColumn});    // record start in track log

        System.out.println("start solving\n");
        System.out.printf("maze - (%d,%d) current position\n",