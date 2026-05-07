package tasks.month3.sprint55.escpeMaze;




public class Position {
    // ─────────────────────────────────────────
    // STEP 2 — DECLARE START/END POSITION .
    // ─────────────────────────────────────────

//    Position positions = new Position();

    //--------------------------------------------------
    //oop object varriables
    private static char[][] array2d = MazeLoader.getArray2d();
    private static int startrow = 0;
    private static int startColumn = 0;    //start

    private static int exitRow = 0;
    private static int exitcolum = 0;      //exit

    public static void getStartExitPosition(){

        for (int row = 0; row < array2d.length; row++) {
            for (int col = 0; col < array2d[row].length; col++) {
                if (array2d[row][col] == '@') {
                    startrow = row;                 // found start row
                    startColumn = col;                 // found start col
                }
                if (array2d[row][col] == 'E') {
                    exitRow = row;                  // found exit row
                    exitcolum = col;                  // found exit col
                }
            }
        }

        //handle error
        if (startrow == -1 || exitRow == -1) {
            System.out.println("Error: maze must have '@' and 'E'");