package test_task;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayListOfAllLines = new ArrayList<>();
        HashMap<Integer, String> resultOfCompare = new HashMap<>();

        for (String singleLine : args) {
            Integer countOfEntry = checkAmountOfEntry(singleLine, arrayListOfAllLines);
            resultOfCompare.put(countOfEntry, singleLine);
            arrayListOfAllLines.add(singleLine);
        }

        System.out.println("the max occurred line is [" + resultOfCompare.get(resultOfCompare.size() - 1) + "] for " + (resultOfCompare.size()) + " times" +
                ". The amount of words in that line is " + resultOfCompare.get(resultOfCompare.size() - 1).split(" ").length);
    }

    private static Integer checkAmountOfEntry(String singleLine, ArrayList<String> arrayListOfAllLines) {
        int count = 0;
        for (String singleLineFromArrayList : arrayListOfAllLines) {
            if (singleLine.contentEquals(singleLineFromArrayList)) {
                count++;
            }
        }

        return count;
    }
}
