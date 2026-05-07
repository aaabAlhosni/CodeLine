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

            //split the complains List {6,8,10,3,43,2}

            String[] split = args[1].split(",");

            //convert them to int
            numbers = new int[split.length];

            for (int i = 0 ;i < split.length; i++ ){
                numbers[i] = Integer.parseInt(split[i].trim());
                dataset.add(numbers[i]);
            }