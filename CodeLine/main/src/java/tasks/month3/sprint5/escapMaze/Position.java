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
