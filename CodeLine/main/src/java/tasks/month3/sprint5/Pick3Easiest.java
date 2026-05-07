package tasks.month3.sprint55;



import java.util.ArrayList;
import java.util.Arrays;


public class Pick3Easiest {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage: java InternQueueSorter <comma-separated-numbers>");
        }

        if (!args[0].equals("selectionsort") && !args[0].equals("bubblesorting")){
            System.out.println("Please enter <method> correctly");
        }

        //Declaring
        ArrayList<Integer> dataset =  new ArrayList<Integer>();
        String method = "";
        int[] numbers;

        try {
            //taking input
            method = args[0].toLowerCase().trim();