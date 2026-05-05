package tasks.month2.sprint3;

public class AdvancedLoopChallengeHollowPyramidPattern {
    public static void main(String[] args) {

        int numOfRows = 6;
//===============================================================
    //  outer loop
        for (int i = 0 ; i <= numOfRows ; i++){
//            inner loop
            for (int j = i - 1  ; j < numOfRows; j++ ){
                System.out.print(" ");
            }
